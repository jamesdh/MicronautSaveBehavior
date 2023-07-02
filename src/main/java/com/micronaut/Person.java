package com.micronaut;

import io.hypersistence.tsid.TSID;
import io.micronaut.data.annotation.DateCreated;
import io.micronaut.data.annotation.DateUpdated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
public class Person {

    public Person() {
        id = TSID.fast().toLong();
    }

    @Id
    private Long id;

    private String name;

    @DateCreated
    @Column(nullable = false)
    private Instant dateCreated;

    @DateUpdated
    @Column(nullable = false)
    private Instant lastUpdated;

}
