package com.jaisoft.vo.factory;

import com.jaisoft.vo.vo.DocumentMetadataVO;
import org.junit.jupiter.api.Test;

class DocumentMetadataVOFactoryUnitTest {


    @Test
    void document_metadata_vo_factory(){

        DocumentMetadataVO documentMetadataVO1 = DocumentMetadataVOFactory.getInstance(
                "",
                "document_value_1");
        DocumentMetadataVO documentMetadataVO2 = DocumentMetadataVOFactory.getInstance(
                "document_name_2",
                "document_value_2");

        DocumentMetadataVO documentMetadataVO3 = DocumentMetadataVOFactory.getInstance(
                "document_name_3",
                "document_value_3");






    }
}