package com.jaisoft.vo.entity;

import com.jaisoft.vo.vo.DocumentMetadataVO;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "DOCUMENT")
@Data
@NoArgsConstructor
public class DocumentAggregate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DOCUMENT_ID")
    private Long documentId;
    @NotNull
    @NotBlank(message = "Document name is mandatory")
    @Column(name = "DOCUMENT_NAME")
    private String documentName;
    @Column(name = "SALESFORCE_DOCUMENT_ID")
    private String salesforceDocumentId;
    @Column(name = "SHAREPOINT_DOCUMENT_ID")
    private String sharepointDocumentId;

    @ElementCollection(targetClass = DocumentMetadataVO.class)
    @CollectionTable(name = "DOCUMENT_METADATA", joinColumns = @JoinColumn(name = "DOCUMENT_ID"))
    @Column(name = "DOCUMENT_METADATA")
    private List<DocumentMetadataVO> documentMetadata;

    public DocumentAggregate(String documentName, String salesforceDocumentId, String sharepointDocumentId, List<DocumentMetadataVO> documentMetadata) {
        this.documentName = documentName;
        this.salesforceDocumentId = salesforceDocumentId;
        this.sharepointDocumentId = sharepointDocumentId;
        this.documentMetadata = documentMetadata;
    }



    /* @Column(name = "DOCUMENT_ACTION") TODO REVISAR
    private String documentAction; //= “carga de documento”
    private String documentSalesforceId;*/



}
