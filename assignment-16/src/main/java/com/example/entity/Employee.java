package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "myid")
	private int id;
	@Column(name = "myname", length = 20)
	private String name;
	@Column(name = "myemail", length = 25, unique = true)
//	@NotNull(message = "must include email in postman API")
//	@NotBlank(message = "must type Value in email")
//	@Email(message = "Please provide proper mail id")
	private String email;
}
