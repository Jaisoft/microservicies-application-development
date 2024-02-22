package com.jaisoft.vo.service;

import com.jaisoft.vo.repository.DocumentRepository;
import com.jaisoft.vo.entity.DocumentAggregate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DocumentServiceUnitTest {

    @InjectMocks
    DocumentService documentService;

    @Mock
    DocumentRepository documentRepository;

    @Test
    public void create_document()  {

        DocumentAggregate documentAggregate = new DocumentAggregate();
        documentAggregate.setDocumentName("document_name");
        documentAggregate.setSalesforceDocumentId("salesforce_document_id");
        documentAggregate.setSharepointDocumentId("sharepoint_document_id");

        when(documentRepository.save(any(DocumentAggregate.class))).thenReturn(documentAggregate);

        DocumentAggregate documentAggregateCreated = documentService.createDocument(documentAggregate);
        assertThat(documentAggregateCreated.getDocumentName()).isSameAs(documentAggregate.getDocumentName());

    }
}