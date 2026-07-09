package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@RestController
public class CountryController {

    @Autowired

    CountryService service;

    @GetMapping("/country")

    public Country getCountry() {

        return service.getCountry();

    }

}