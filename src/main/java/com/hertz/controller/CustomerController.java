/**
 * 
 */
package com.hertz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hertz.entity.Customer;
import com.hertz.repository.CustomerRepository;

/**
 * @author Subba Rao Ch
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/all")
	public List<Customer> listPersons(){
		return customerRepository.findAll();
	}

	@RequestMapping("/{id}")
	public Customer getById(@PathVariable Integer id){
		return customerRepository.findOne(id);
	}
}
