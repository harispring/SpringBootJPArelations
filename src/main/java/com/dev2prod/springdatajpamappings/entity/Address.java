package com.dev2prod.springdatajpamappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressId;
    private String city;
    private String addressType;
    
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id") private
	 * Employee employee;
	 */
   

    

	
	 
}
