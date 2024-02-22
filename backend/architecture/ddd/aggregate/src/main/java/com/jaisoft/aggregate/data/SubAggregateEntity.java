package com.jaisoft.aggregate.data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SubAggregateEntity {

    @Column
    String nameEntity;

    public SubAggregateEntity(String nameEntity) {
        this.nameEntity = nameEntity;
    }

    public SubAggregateEntity(){}
}
