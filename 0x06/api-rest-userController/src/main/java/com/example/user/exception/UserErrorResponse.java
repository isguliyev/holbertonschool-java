package com.example.user.exception;

public class UserErrorResponse {
    private int status;
    private String message;

    public UserErrorResponse() {}

    public UserErrorResponse(int status, String message) {
        this.setStatus(status);
        this.setMessage(message);
    }

    public int getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}