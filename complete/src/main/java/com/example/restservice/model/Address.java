package com.example.restservice.model;

public class Address {
    private int streetNumber;
    private String streetName;
    private String postCode;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Address(int streetNumber, String streetName, String postCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "StreetNumber='" + streetNumber + '\'' +
                ", StreetName='" + streetName + '\'' +
                ", PostCode='" + postCode + '\'' +
                '}';
    }
}

