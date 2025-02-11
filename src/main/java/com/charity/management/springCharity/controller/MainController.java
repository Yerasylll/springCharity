package com.charity.management.springCharity.controller;

import com.charity.management.springCharity.entities.Charity;
import com.charity.management.springCharity.entities.Donation;
import com.charity.management.springCharity.entities.Donor;
import com.charity.management.springCharity.repositories.CharityRepository;
import com.charity.management.springCharity.repositories.DonationRepository;
import com.charity.management.springCharity.repositories.DonorRepository;
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
    private final DonorRepository donorRepository;
    private final DonationRepository donationRepository;
    private final CharityRepository charityRepository;

    // CHARITY
    @PostMapping("/charity/add")
    public String addCharity(@RequestBody Charity charity) {
        try {
            charityRepository.save(charity);
            return "Charity added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/charity/all")
    public List<Charity> getAllCharities() {
        return charityRepository.findAll();
    }

    @GetMapping("/charity")
    public Optional<Charity> getCharity(@RequestParam int id) {
        return charityRepository.findById(id);
    }

    @DeleteMapping("/charity")
    public String deleteCharity(@RequestParam int id) {
        if (charityRepository.existsById(id)) {
            charityRepository.deleteById(id);
            return "Charity deleted successfully!";
        }
        return "Charity not found!";
    }

    @PutMapping("/charity/update")
    public String updateCharity(@RequestBody Charity charity) {
        if(!charityRepository.existsById(charity.getId())) {
            return "Charity not found!";
        }
        charityRepository.save(charity);
        return "Charity updated successfully!";
    }

    // DONATION
    @PostMapping("/donation/add")
    public String addDonation(@RequestBody Donation donation) {
        try {
            donationRepository.save(donation);
            return "Donation added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/donation/all")
    public List<Donation> getAllDonation() {
        return donationRepository.findAll();
    }

    @GetMapping("/donation")
    public Optional<Donation> getDonation(@RequestParam int id) {
        return donationRepository.findById(id);
    }

    @DeleteMapping("/donation")
    public String deleteDonation(@RequestParam int id) {
        if (donationRepository.existsById(id)) {
            donationRepository.deleteById(id);
            return "Donation deleted successfully!";
        }
        return "Donation not found!";
    }

    @PutMapping("/donation/update")
    public String updateDonation(@RequestBody Donation donation) {
        if(!donationRepository.existsById(donation.getId())) {
            return "Donation not found!";
        }
        donationRepository.save(donation);
        return "Donation updated successfully!";
    }

    // DONOR
    @PostMapping("/donor/add")
    public String addDonor(@RequestBody Donor donor) {
        try {
            donorRepository.save(donor);
            return "Donor added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/donor/all")
    public List<Donor> getAllDonor() {
        return donorRepository.findAll();
    }

    @GetMapping("/donor")
    public Optional<Donor> getDonor(@RequestParam int id) {
        return donorRepository.findById(id);
    }

    @DeleteMapping("/donor")
    public String deleteDonor(@RequestParam int id) {
        if (donorRepository.existsById(id)) {
            donorRepository.deleteById(id);
            return "Donor deleted successfully!";
        }
        return "Donor not found!";
    }

    @PutMapping("/donor/update")
    public String updateDonor(@RequestBody Donor donor) {
        if (!donorRepository.existsById(donor.getId())) {
            return "Donor not found!";
        }
        donorRepository.save(donor);
        return "Donor updated successfully!";
    }
}
