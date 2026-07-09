package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {

        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
        countries.add(new Country("AU", "Australia"));

    }

    public Country getCountry(String code) {

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {

                return country;

            }

        }

        return null;

    }

}