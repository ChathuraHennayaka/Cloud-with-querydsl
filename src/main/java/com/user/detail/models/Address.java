package com.user.detail.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address extends BaseModelObject{

	
	private static final long serialVersionUID = 1L;
	
	private int number;
	
	private String city;
	
	private String district;
	
	@OneToOne
	private User user;
	
}
