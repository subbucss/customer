/**
 * 
 */
package com.hertz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Subba Rao Ch
 *
 */
@Entity
@Table(name = "CUSTOMER", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CUST_ID_SEQ")
	@SequenceGenerator(name = "CUST_ID_SEQ", sequenceName = "CUST_ID_SEQ")
	@Column(name = "ID", length = 11)
	private Integer id;
	
	@Column(name = "NAME", length = 300)
	private String name;
	
	@Column(name = "EMAIL", length = 300)
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
