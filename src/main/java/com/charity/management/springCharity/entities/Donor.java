package com.charity.management.springCharity.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@ToString
@Table(name = "donor")
public class Donor {

    public Donor(int id, String firstName, String lastName, String countryName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryName = countryName;
        this.age = age;
    }

    public Donor() {}

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
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(unique = true)
    private String firstName;
    private String lastName;
    private String countryName;
    private int age;

    @Override
    public String toString() {
        return "donor{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", countryName=" + countryName +
                ", age=" + age +
                '}';
    }
}
