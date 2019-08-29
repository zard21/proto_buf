package com.zard21.proto;

import com.zard21.model.proto.CountryModels.Country;

import java.util.Map;

public class CountryRepository {

    Map<Integer, Country> countries;

    public CountryRepository(Map<Integer, Country> countries) {
        this.countries = countries;
    }

    public Country getCountry(int id) {
        return countries.get(id);
    }
}
