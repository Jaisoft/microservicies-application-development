package com.jaisoft.vo.repository;

import com.jaisoft.vo.factory.DocumentMetadataVOFactory;
import com.jaisoft.vo.vo.DocumentMetadataVO;
import com.jaisoft.vo.entity.DocumentAggregate;
import com.jaisoft.vo.factory.DocumentFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class DocumentRepositoryIntegrationTest {

    @Autowired
    private DocumentRepository documentRepository;

    @Test
    public void create_document()  {


        DocumentMetadataVO documentMetadataVO1 = DocumentMetadataVOFactory.getInstance(
                "document_name_1",
                "document_value_1");
        DocumentMetadataVO documentMetadataVO2 = DocumentMetadataVOFactory.getInstance(
                "document_name_2",
                "document_value_2");

        DocumentMetadataVO documentMetadataVO3 = DocumentMetadataVOFactory.getInstance(
                "document_name_3",
                "document_value_3");

        List<DocumentMetadataVO> setDocumentMetadata = new ArrayList<>();
        setDocumentMetadata.add(documentMetadataVO1);
        setDocumentMetadata.add(documentMetadataVO2);
        setDocumentMetadata.add(documentMetadataVO3);

        DocumentAggregate documentAggregate = DocumentFactory.getInstance(
                "document_name",
                "salesforce_document_id",
                "sharepoint_document_id" ,
                setDocumentMetadata);
        documentAggregate.setDocumentMetadata(setDocumentMetadata);

        DocumentAggregate documentAggregateCreated = documentRepository.save(documentAggregate);

        assertThat(documentAggregateCreated).isNotNull();
        assertThat(documentAggregateCreated.getDocumentName()).isNotBlank();
        assertThat(documentAggregateCreated.getDocumentName()).isNotEmpty();
        assertThat(documentAggregateCreated.getDocumentName()).isNotNull();
        assertThat(documentAggregateCreated.getDocumentMetadata()).isNotNull();
        assertThat(documentAggregateCreated.getDocumentMetadata().getClass()).isNotNull();

    }



}