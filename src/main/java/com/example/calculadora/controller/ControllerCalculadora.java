package com.example.calculadora.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class ControllerCalculadora {

    @GetMapping(value = "/calcula")
    public ResponseEntity<Double> calcula(@RequestParam(name = "primero") BigDecimal primerNumero,
                                          @RequestParam(name = "segundo") BigDecimal segundoNumero,
                                          @RequestParam(name = "operacion") String operacion) {

        double result = 5;

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}