package com.example.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;
import com.example.user.exception.CPFException;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        if (id <= 0 || id > 100) {
            throw new UserIdException("You have entered an invalid ID");
        }

        return "You have entered a valid ID";
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        if (userName.length() <= 3 || userName.length() > 15) {
            throw new UserNameException("You have entered an invalid USERNAME");
        }

        return "You have entered a valid USERNAME";
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        if (cpf.length() <= 3 || cpf.length() > 15) {
            throw new CPFException("You have entered an invalid CPF");
        }

        return "You have entered a valid CPF";
    }
}