package com.example.calculator.model;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Calculator {
    public void validateNumbers(Double number1, Double number2) {
        if (number1 == null && number2 == null) {
            throw new NullPointerException("First and second number required");
        }

        if (number1 == null) {
            throw new NullPointerException("First number required");
        }

        if (number2 == null) {
            throw new NullPointerException("Second number required");
        }
    }

    public Double sum(Double number1, Double number2) {
        validateNumbers(number1, number2);
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        validateNumbers(number1, number2);
        return number1 - number2;
    }

    public Double divide(Double number1, Double number2) {
        validateNumbers(number1, number2);

        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return number1 / number2;
    }

    public Integer factorial(Integer number) {
        if (number == null) {
            throw new NullPointerException("Number is required");
        }

        if (number < 0) {
            throw new IllegalArgumentException("Number is negative");
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public String integerToBinary(Integer number) {
        if (number == null) {
            throw new NullPointerException("Number is required");
        }

        int integerBitCount = Integer.BYTES * 8;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < integerBitCount; i++) {
            if ((number & (1 << i)) == 0) {
                result.append("0");
            } else {
                result.append("1");
            }
        }

        return result.reverse().toString();
    }

    public String integerToHexadecimal(Integer number) {
        if (number == null) {
            throw new NullPointerException("Number is required");
        }

        if (number == 0) return "0";

        char[] hexadecimalCharArray = "0123456789ABCDEF".toCharArray();
        int hexadecimalBase = 16;
        boolean isNegative = false;
        StringBuilder result = new StringBuilder();

        if (number < 0) isNegative = true;

        number = Math.abs(number);

        while (number != 0) {
            result.append(hexadecimalCharArray[number % hexadecimalBase]);
            number /= hexadecimalBase;
        }

        if (isNegative) result.append('-');

        return result.reverse().toString();
    }

    public Integer calculateDayBetweenDate(LocalDate localDate1, LocalDate localDate2) {
        if (localDate1 == null && localDate2 == null) {
            throw new NullPointerException("First and second date required");
        }

        if (localDate1 == null) {
            throw new NullPointerException("First date required");
        }

        if (localDate2 == null) {
            throw new NullPointerException("Second date required");
        }

        return (int) ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}