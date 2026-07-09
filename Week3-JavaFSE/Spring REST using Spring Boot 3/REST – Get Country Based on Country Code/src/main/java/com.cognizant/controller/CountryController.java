package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@RestController
public class CountryController {

    @Autowired

    CountryService service;

    @GetMapping("/country/{code}")

    public Country getCountry(

            @PathVariable String code) {

        return service.getCountry(code);

    }

}