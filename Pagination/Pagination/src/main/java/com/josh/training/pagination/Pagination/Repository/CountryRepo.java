package com.josh.training.pagination.Pagination.Repository;

import com.josh.training.pagination.Pagination.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Integer> {
}
