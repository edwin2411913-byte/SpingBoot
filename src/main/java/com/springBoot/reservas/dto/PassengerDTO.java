package com.springBoot.reservas.dto;

import java.util.Date;

public class PassengerDTO {
    private String firstName;
    private String lastName;
    private String documentNumber;

    public PassengerDTO(Date birthday, String firstName, String documentNumber, String lastName) {
        this.birthday = birthday;
        this.firstName = firstName;
        this.documentNumber = documentNumber;
        this.lastName = lastName;
    }

    public PassengerDTO() {
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Date birthday;

}
