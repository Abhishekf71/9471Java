package com.demo.CollectionsSetMapping.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int e_pincode;
	private String e_state;
	private String e_city;
	public int getE_pincode() {
		return e_pincode;
	}
	public void setE_pincode(int e_pincode) {
		this.e_pincode = e_pincode;
	}
	public String getE_state() {
		return e_state;
	}
	public void setE_state(String e_state) {
		this.e_state = e_state;
	}
	public String getE_city() {
		return e_city;
	}
	public void setE_city(String e_city) {
		this.e_city = e_city;
	}
	
}
