package com.example.calculator.controller;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.client.RestTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureRestTestClient
public class CalculatorControllerTest {
    @Autowired
    private RestTestClient restTestClient;

    @Test
    public void messageWelcomeTest() {
        restTestClient.get()
        .uri("/calculator/welcome")
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("Welcome to CALCULATOR API REST");
    }

    @Test
    public void addNumbersTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/addNumbers")
            .queryParam("number1", 1.0d)
            .queryParam("number2", 1.0d)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("2.0");
    }

    @Test
    public void subNumbersTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/subNumbers")
            .queryParam("number1", 1.0d)
            .queryParam("number2", 1.0d)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("0.0");
    }

    @Test
    public void divideNumbersTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/divideNumbers")
            .queryParam("number1", 10.0d)
            .queryParam("number2", 5.0d)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("2.0");
    }

    @Test
    public void factorialTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/factorial")
            .queryParam("number", 10)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("3628800");
    }

    @Test
    public void calculateDayBetweenDateTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/calculateDayBetweenDate")
            .queryParam("localDate1", "01/10/2011")
            .queryParam("localDate2", "02.10.2012")
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("367");
    }

    @Test
    public void integerToBinaryTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/integerToBinary")
            .queryParam("number", -12)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("11111111111111111111111111110100");
    }

    @Test
    public void integerToHexadecimalTest() {
        restTestClient.get()
        .uri(
            uriBuilder -> uriBuilder
            .path("/calculator/integerToHexadecimal")
            .queryParam("number", -254)
            .build()
        )
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class)
        .isEqualTo("-FE");
    }
}