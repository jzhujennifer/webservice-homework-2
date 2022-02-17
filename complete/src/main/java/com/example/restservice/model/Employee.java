package com.example.restservice.model;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Employee(int id, String firstName, String lastName, int age, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lname='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", Address='" + address + '\'' +
                '}';

    }
}
