package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.AuthenticationRequest;
import com.cognizant.service.JwtService;

@RestController
public class AuthenticationController {

    @Autowired
    JwtService service;

    @PostMapping("/authenticate")
    public String authenticate(

            @RequestBody AuthenticationRequest request) {

        if(request.getUsername().equals("admin")

                &&

           request.getPassword().equals("admin123"))

        {

            return service.generateToken(request.getUsername());

        }

        return "Invalid Username or Password";

    }

}