package com.user.detail.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseModelObject {


	private static final long serialVersionUID = 1L;

	private int userid;
	
	@NotNull
	private String firstName;
	
	private String lastName;
	
	private String email;

	private int phoneNumber;
	
	@OneToOne
	private Address address;
	

}
