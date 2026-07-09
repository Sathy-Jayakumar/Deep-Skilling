package com.cognizant.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

@Service
public class CountryService {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry() {

        return (Country) context.getBean("country");

    }

}