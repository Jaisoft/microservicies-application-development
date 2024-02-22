package com.jaisoft.vo.factory;

import com.jaisoft.vo.vo.DocumentMetadataVO;

import javax.validation.*;
import java.util.Set;

public final class DocumentMetadataVOFactory {

    public static DocumentMetadataVO getInstance(
            String metadataDocumentName,
            String metadataDocumentValue){

        DocumentMetadataVO documentMetadataVO = new DocumentMetadataVO(metadataDocumentName, metadataDocumentValue);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<DocumentMetadataVO>> violations = validator.validate(documentMetadataVO);

        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        return documentMetadataVO;
    }
}
