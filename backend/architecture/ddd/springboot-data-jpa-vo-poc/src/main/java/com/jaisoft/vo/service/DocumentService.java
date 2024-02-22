package com.jaisoft.vo.service;

import com.jaisoft.vo.repository.DocumentRepository;
import com.jaisoft.vo.entity.DocumentAggregate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DocumentService {

    private DocumentRepository documentRepository;

    public DocumentAggregate createDocument(DocumentAggregate documentAggregate) {
        return documentRepository.save(documentAggregate);
    }
}
