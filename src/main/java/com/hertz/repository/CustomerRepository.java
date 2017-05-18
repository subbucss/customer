/**
 * 
 */
package com.hertz.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hertz.entity.Customer;

/**
 * @author Subba Rao Ch
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
