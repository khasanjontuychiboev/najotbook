package com.xasan.books.service;

import com.xasan.books.entity.Country;
import com.xasan.books.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country createNewCountry(Country country){
        return countryRepository.save(country);
    }

}
