package com.josh.training.pagination.Pagination.service;

import com.josh.training.pagination.Pagination.entity.Country;

import java.awt.print.Pageable;
import java.util.List;

public interface CountryService {
    public List<Country> getAllCountry(Country country);

    public Country saveData(Country country);

    public List<Country> paginate(Country country);

}
