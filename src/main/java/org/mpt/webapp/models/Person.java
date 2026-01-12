package org.mpt.webapp.models;

public class Person {
    private String name;
    private String role;
    private String phone;
    private String email;

    // Konstruktor
    public Person(String name, String role, String phone, String email) {
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.email = email;
    }

    // Gettery są wymagane przez Thymeleaf!
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}