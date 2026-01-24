package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.calculator.model.Calculator;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    private final Calculator calculator;

    public CalculatorController() {
        this.calculator = new Calculator();
    }

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Welcome to CALCULATOR API REST";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(
        @RequestParam(name = "number1") Double number1,
        @RequestParam(name = "number2") Double number2
    ) {
        return this.calculator.sum(number1, number2).toString();
    }

    @GetMapping("/subNumbers")
    public String subNumbers(
        @RequestParam(name = "number1") Double number1,
        @RequestParam(name = "number2") Double number2
    ) {
        return this.calculator.sub(number1, number2).toString();
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(
        @RequestParam(name = "number1") Double number1,
        @RequestParam(name = "number2") Double number2
    ) {
        return this.calculator.divide(number1, number2).toString();
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "number") Integer number) {
        return this.calculator.factorial(number).toString();
    }

    @GetMapping("/calculateDayBetweenDate")
    public String calculateDayBetweenDate(
        @RequestParam("localDate1") @DateTimeFormat(
            iso = DateTimeFormat.ISO.DATE,
            fallbackPatterns = {"yyyy/M/d", "d/M/yyyy", "dd.MM.yyyy"}
        ) LocalDate localDate1,
        @RequestParam("localDate2") @DateTimeFormat(
            iso = DateTimeFormat.ISO.DATE,
            fallbackPatterns = {"yyyy/M/d", "d/M/yyyy", "dd.MM.yyyy"}
        ) LocalDate localDate2
    ) {
        return this.calculator.calculateDayBetweenDate(localDate1, localDate2).toString();
    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number") Integer number) {
        return this.calculator.integerToBinary(number);
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number") Integer number) {
        return this.calculator.integerToHexadecimal(number);
    }
}