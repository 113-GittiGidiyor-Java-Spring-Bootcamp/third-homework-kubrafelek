package com.dev.patika.homework02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class Converter {

    private final static double DOLLAR_STATUS = 8.75;

    RestTemplate restTemplate;

    @GetMapping("/convertMoney/{money}")
    public Double convertMoneyToDollar(double money) throws RuntimeException {
        return DOLLAR_STATUS * money;
    }
}
