package com.jaisoft.vo.factory;

import com.jaisoft.vo.vo.DocumentMetadataVO;
import com.jaisoft.vo.entity.DocumentAggregate;

import javax.validation.*;
import java.util.List;
import java.util.Set;

public final class DocumentFactory {

    public static DocumentAggregate getInstance(String documentName, String salesforceDocumentId, String sharepointDocumentId, List<DocumentMetadataVO> documentMetadata){

        DocumentAggregate documentAggregate = new DocumentAggregate(documentName,salesforceDocumentId, sharepointDocumentId, documentMetadata);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<DocumentAggregate>> violations = validator.validate(documentAggregate);

        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        return documentAggregate;
    }








}
