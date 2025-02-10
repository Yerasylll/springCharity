package com.charity.management.springCharity.repositories;

import com.charity.management.springCharity.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepo extends JpaRepository<Donor, Integer> {
}
