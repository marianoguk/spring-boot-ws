package org.coding.springboot.ws.countrysoap.domain.repository;

import org.coding.springboot.ws.countrysoap.domain.model.Country;

public interface CountryRepository {
    Country findByName(String countryName);
}
