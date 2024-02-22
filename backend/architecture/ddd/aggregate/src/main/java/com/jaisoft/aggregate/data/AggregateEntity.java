package com.jaisoft.aggregate.data;

import javax.persistence.*;

@Entity
public class AggregateEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long idAggregate;
    @Column
    String aggregateName;
    @Embedded
    SubAggregateEntity subAggregateEntity;
    @Embedded
    ValueObject valueObject;


    public AggregateEntity(String aggregateName, SubAggregateEntity subAggregateEntity, ValueObject valueObject) {
        this.aggregateName = aggregateName;
        this.subAggregateEntity = subAggregateEntity;
        this.valueObject = valueObject;
    }

    public AggregateEntity(){}
}
