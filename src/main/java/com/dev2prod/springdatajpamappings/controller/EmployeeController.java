package com.dev2prod.springdatajpamappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev2prod.springdatajpamappings.entity.Address;
import com.dev2prod.springdatajpamappings.entity.Employee;
import com.dev2prod.springdatajpamappings.repository.AddressRepository;
import com.dev2prod.springdatajpamappings.repository.EmployeeRepository;
import com.dev2prod.springdatajpamappings.request.EmployeeRequest;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;
    
    @Autowired
    private AddressRepository addRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody Employee empData) {
        empRepository.save(empData);
        return ResponseEntity.ok("Data saved");
    }
    
 /*   @PostMapping("/saveEmployeesOneToManyBidirectional")
    public ResponseEntity<String> saveEmployees(@RequestBody EmployeeRequest employeeRequest) {
    	
    	Employee emp = new Employee(employeeRequest);
    	emp = empRepository.save(emp);
    		
    	for (Address x : employeeRequest.getAddress()) {
    		Address address = new Address();
    		address.setCity(x.getCity());
    		address.setAddressType(x.getAddressType());
    		address.setEmployee(emp);
    		addRepository.save(address);
		}
    	
    	//empRepository.save(empData);
        return new ResponseEntity<String>("Data saved",HttpStatus.CREATED);
    }
    
    
    */

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
    	List<Employee> empList = empRepository.findAll();
    	System.out.println(empList.size());
    	
        return empList;
    }
}
