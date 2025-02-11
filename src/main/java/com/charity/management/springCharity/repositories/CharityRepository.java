package com.charity.management.springCharity.repositories;

import com.charity.management.springCharity.entities.Charity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharityRepository extends JpaRepository<Charity, Integer> {

}
