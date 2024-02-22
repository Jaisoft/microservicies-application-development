package com.jaisoft.vo.factory;

import com.jaisoft.vo.entity.DocumentAggregate;
import com.jaisoft.vo.vo.DocumentMetadataVO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DocumentFactoryUnitTest {

    @Test
    void document_factory(){

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


    }

}