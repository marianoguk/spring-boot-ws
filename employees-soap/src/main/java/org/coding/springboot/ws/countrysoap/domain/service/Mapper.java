package org.coding.springboot.ws.countrysoap.domain.service;

import org.coding.springboot.ws.countrysoap.domain.model.Country;
import org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.Currency;

public class Mapper {

    public org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.Country to(Country country) {
        org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.Country result =
                new org.coding.springboot.ws.countrysoap.infraestructura.endpoint.message.Country();

        result.setName(country.getName());
        result.setCapital(country.getCapital());
        result.setCurrency(Currency.fromValue(country.getCurrency().name()));
        result.setPopulation(country.getPopulation());
        return result;
    }
}
