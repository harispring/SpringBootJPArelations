package com.dev2prod.springdatajpamappings.controller;

import com.dev2prod.springdatajpamappings.entity.Address;
import com.dev2prod.springdatajpamappings.entity.Employee;
import com.dev2prod.springdatajpamappings.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addRepository;

    @GetMapping("/getAddress")
    public List<Address> getAddresses(){
        return addRepository.findAll();
    }
    

    @PostMapping("/saveAddress")
    public ResponseEntity<String> saveEmployees(@RequestBody Address address) {
    	addRepository.save(address);
        return ResponseEntity.ok("Address Data saved");
    }
}
