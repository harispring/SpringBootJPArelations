package com.dev2prod.springdatajpamappings.request;

import java.util.List;

import com.dev2prod.springdatajpamappings.entity.Address;

import lombok.Data;
@Data
public class EmployeeRequest {
	
    private String empName;
    private Integer empAge;
    
    private List<Address> address;

}
