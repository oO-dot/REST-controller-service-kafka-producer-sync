package ru.kafkademo.ws.productmicroservice.controller;

import java.util.Date;

public class ErrorMessage {
    private Date timeestamp;
    private String message;

    public ErrorMessage(Date timeestamp, String message) {
        this.timeestamp = timeestamp;
        this.message = message;
    }

    public Date getTimeestamp() {
        return timeestamp;
    }

    public void setTimeestamp(Date timeestamp) {
        this.timeestamp = timeestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
