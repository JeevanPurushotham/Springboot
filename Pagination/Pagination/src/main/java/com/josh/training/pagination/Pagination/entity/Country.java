package com.josh.training.pagination.Pagination.entity;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int countryId;
    private String countryName;
    private  String famousPlace;
}
