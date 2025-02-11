package com.charity.management.springCharity.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.*;



@Getter
@Entity
@Builder
@Table(name = "charity")
public class Charity {

    public Charity(int id, String charityName, String description, double charityBudget) {
        this.id = id;
        this.charityName = charityName;
        this.description = description;
        this.charityBudget = charityBudget;
    }

    public Charity() {}

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCharityBudget() {
        return charityBudget;
    }

    public void setCharityBudget(double charityBudget) {
        this.charityBudget = charityBudget;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "charity_name", unique = true)
    private String charityName;
    private String description;
    private double charityBudget;

    @Override
    public String toString() {
        return "Charity{" + "id=" + id +
                ", name=" + charityName +
                ", description=" + description +
                ", budget=" + charityBudget +
                '}';
    }

}
