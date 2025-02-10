package com.charity.management.springCharity.controller;

import com.charity.management.springCharity.entities.Charity;
import com.charity.management.springCharity.entities.Donation;
import com.charity.management.springCharity.entities.Donor;
import com.charity.management.springCharity.repositories.CharityRepo;
import com.charity.management.springCharity.repositories.DonationRepo;
import com.charity.management.springCharity.repositories.DonorRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {

    @Autowired
    private final DonorRepo donorRepo;
    private final DonationRepo donationRepo;
    private final CharityRepo charityRepo;
    private ObjectMapper objectMapper;

    // CHARITY
    @PostMapping("/charity/add")
    public String addCharity(@RequestBody Charity charity) {
        try {
            charityRepo.save(charity);
            return "Charity added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/charity/all")
    public List<Charity> getAllCharities() {
        return charityRepo.findAll();
    }

    @GetMapping("/charity")
    public Optional<Charity> getCharity(@RequestParam int id) {
        return charityRepo.findById(id);
    }

    @DeleteMapping("/charity")
    public String deleteCharity(@RequestParam int id) {
        if (charityRepo.existsById(id)) {
            charityRepo.deleteById(id);
            return "Charity deleted successfully!";
        }
        return "Charity not found!";
    }

    @PutMapping("/charity/update")
    public String updateCharity(@RequestBody Charity charity) {
        if(!charityRepo.existsById(charity.getId())) {
            return "Charity not found!";
        }
        charityRepo.save(charity);
        return "Charity updated successfully!";
    }

    // DONATION
    @PostMapping("/donation/add")
    public String addDonation(@RequestBody Donation donation) {
        try {
            donationRepo.save(donation);
            return "Donation added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/movie/all")
    public List<Donation> getAllDonation() {
        return donationRepo.findAll();
    }

    @GetMapping("/donation")
    public Optional<Donation> getDonation(@RequestParam int id) {
        return donationRepo.findById(id);
    }

    @DeleteMapping("/donation")
    public String deleteDonation(@RequestParam int id) {
        if (donationRepo.existsById(id)) {
            donationRepo.deleteById(id);
            return "Donation deleted successfully!";
        }
        return "Donation not found!";
    }

    @PutMapping("/donation/update")
    public String updateDonation(@RequestBody Donation donation) {
        if(!donationRepo.existsById(donation.getId())) {
            return "Donation not found!";
        }
        donationRepo.save(donation);
        return "Donation updated successfully!";
    }

    // DONOR
    @PostMapping("/donor/add")
    public String addDonor(@RequestBody Donor donor) {
        try {
            donorRepo.save(donor);
            return "Donor added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/donor/all")
    public List<Donor> getAllDonor() {
        return donorRepo.findAll();
    }

    @GetMapping("/donor")
    public Optional<Donor> getDonor(@RequestParam int id) {
        return donorRepo.findById(id);
    }

    @DeleteMapping("/donor")
    public String deleteDonor(@RequestParam int id) {
        if (donorRepo.existsById(id)) {
            donorRepo.deleteById(id);
            return "Donor deleted successfully!";
        }
        return "Donor not found!";
    }

    @PutMapping("/donor/update")
    public String updateDonor(@RequestBody Donor donor) {
        if (!donorRepo.existsById(donor.getId())) {
            return "Donor not found!";
        }
        donorRepo.save(donor);
        return "Donor updated successfully!";
    }
}
