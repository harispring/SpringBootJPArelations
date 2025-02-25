package com.dev2prod.springdatajpamappings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    
    
	/*
	 * public Employee(EmployeeRequest employeeRequest){
	 * this.setEmpName(employeeRequest.getEmpName());
	 * this.setEmpAge(employeeRequest.getEmpAge()); }
	 */
   
	/*
	 * //second
	 * 
	 * @OneToMany(mappedBy = "employee") private List<Address> address;
	 */
  //One to Many unidirection
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;
    
    
    
	 
	 



}
