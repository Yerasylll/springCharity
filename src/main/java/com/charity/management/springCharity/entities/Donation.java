package com.charity.management.springCharity.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.ToString;

@Entity
@Builder
@ToString
@Table(name = "donation")
public class Donation {

    public Donation() {}

    public Donation(int id, int amount, Donor donor) {
        this.id = id;
        this.amount = amount;
        this.donor = donor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "donation")
    private int amount;
    @ManyToOne
    @JoinColumn(name = "donor_id")
    private Donor donor;



    @Override
    public String toString() {
        return "Charity{" + "id=" + id +
                ", amount=" + amount +
                ", donorInformation=" + donor +
                '}';
    }

}
