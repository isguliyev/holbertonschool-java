package com.example.MegaSenaAPI.account.dto;

import jakarta.validation.constraints.NotBlank;

public record AccountResponse(Long id, @NotBlank String name) {}