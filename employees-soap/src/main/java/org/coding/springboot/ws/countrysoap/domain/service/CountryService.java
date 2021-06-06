package org.coding.springboot.ws.countrysoap.domain.service;

import org.coding.springboot.ws.countrysoap.domain.repository.CountryRepository;
import org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.Country;

public class CountryService {
    private CountryRepository repository;
    private Mapper mapper;

    public CountryService(CountryRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Country findByName(String countryName) {
        return mapper.to(repository.findByName(countryName));
    }

}
