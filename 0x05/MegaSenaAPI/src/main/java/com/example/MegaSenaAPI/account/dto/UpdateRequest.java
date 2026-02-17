package com.example.MegaSenaAPI.account.dto;

import jakarta.validation.constraints.NotBlank;

public record UpdateRequest(
    @NotBlank(message = "Name is required") String name,
    @NotBlank(message = "Password is required") String password
) {}