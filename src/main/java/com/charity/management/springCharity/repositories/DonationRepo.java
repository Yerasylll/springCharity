package com.charity.management.springCharity.repositories;

import com.charity.management.springCharity.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepo extends JpaRepository<Donation, Integer> {

}
