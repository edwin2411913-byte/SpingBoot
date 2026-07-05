package com.springBoot.reservas.model;

import java.time.LocalDate;
import java.util.Date;

public class Passenger {
    private Long id;
    private String firstName;
    private String lastName;
    private String documentNumber;
    private String documentType;
    private LocalDate birthday;

    public Passenger(Long id, String firstName, String documentNumber, String lastName, LocalDate birthday, String documentType) {
        this.id = id;
        this.firstName = firstName;
        this.documentNumber = documentNumber;
        this.lastName = lastName;
        this.birthday = birthday;
        this.documentType = documentType;
    }
    public Passenger() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getDocumentType() {return documentType;}

    public void setDocumentType(String documentType) {this.documentType = documentType;}
}
