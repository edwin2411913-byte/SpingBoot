package com.springBoot.reservas.exeption;

public class ExeptionPersonal extends RuntimeException{

    private String description;

    public ExeptionPersonal(String message) {
        super(message);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
