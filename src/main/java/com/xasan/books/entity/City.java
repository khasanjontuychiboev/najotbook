package com.xasan.books.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {
    @Id
    private Integer id;

    private String name;

    @ManyToOne
    private Country country;
}
