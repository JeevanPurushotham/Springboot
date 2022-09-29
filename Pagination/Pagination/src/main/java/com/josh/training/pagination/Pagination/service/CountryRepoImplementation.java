package com.josh.training.pagination.Pagination.service;

import com.josh.training.pagination.Pagination.Repository.CountryRepo;
import com.josh.training.pagination.Pagination.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CountryRepoImplementation implements CountryService {
    @Autowired
    private CountryRepo countryRepo;


    @Override
    public List<Country> getAllCountry(Country country) {
        return countryRepo.findAll();
    }

    @Override
    public Country saveData(Country country) {
        return countryRepo.save(country);
    }


}
