package com.jaisoft.aggregate.data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ValueObject {
    @Column
    String valueObjectName;


    public ValueObject(String valueObjectName) {
        this.valueObjectName = valueObjectName;
    }

    public ValueObject() {

    }
}
