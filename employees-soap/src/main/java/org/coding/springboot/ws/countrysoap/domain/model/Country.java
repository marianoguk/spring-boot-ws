package org.coding.springboot.ws.countrysoap.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Country {
    private String name;
    private int population;
    private String capital;
    private CurrencyType currency;
}
