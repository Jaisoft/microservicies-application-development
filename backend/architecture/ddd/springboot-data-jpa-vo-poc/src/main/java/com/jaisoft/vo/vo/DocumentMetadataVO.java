package com.jaisoft.vo.vo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public final class DocumentMetadataVO {
    @NotBlank
    private String metadataDocumentName;
    @NotBlank
    private String metadataDocumentValue;
}
