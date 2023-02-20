package com.gk.userregandlog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name can not be empty")
	private String firstName;
	
	@NotBlank(message = "Last name can not be empty")
	private String lastName;
	
	@Column(unique = true, length = 45)
	@Email(message = "Please enter valid email adress")
	private String email;
	
	@Column(length = 64)
	@NotBlank
	private String password;
	
}
