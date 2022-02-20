package com.tp.srm.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Vendor {

	// Vendor Entity attributes
	public String code;
	public String name1;
	public String street1;
	public String street2;
	public String street3;
	public String city;
	public String region;
	public String country;
	public String contactPerson;
	public String emailAddress;
	public String taxIdentification;
	public String phoneNumber;
	public Date registrationDate;
	
	public Vendor() {
		this.code = "250464";
		this.name1 = "Tetra Pak India Pvt. Ltd.";
		this.street1 = "Plot No. B - 53, MIDC Chakan, Phase - 2";
		this.street2 = "Village Vasuli, Taluka Khed";
		this.street3 = "";
		this.city = "Pune";
		this.region = "Maharashtra";
		this.country = "India";
		this.contactPerson = "Neelesh Deshpande";
		this.emailAddress = "Neelesh.Deshpande2@tetrapak.com";
		this.taxIdentification = "GTIN19811223";
		this.phoneNumber = "+91 9820826689";
		this.registrationDate = new Date();
	}

	public Vendor(String code, String name1, String street1, String street2, String street3, String city, String region,
			String country, String contactPerson, String emailAddress, String taxIdentification, String phoneNumber,
			Date registrationDate) {
		super();
		this.code = code;
		this.name1 = name1;
		this.street1 = street1;
		this.street2 = street2;
		this.street3 = street3;
		this.city = city;
		this.region = region;
		this.country = country;
		this.contactPerson = contactPerson;
		this.emailAddress = emailAddress;
		this.taxIdentification = taxIdentification;
		this.phoneNumber = phoneNumber;
		this.registrationDate = registrationDate;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getStreet3() {
		return street3;
	}
	public void setStreet3(String street3) {
		this.street3 = street3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTaxIdentification() {
		return taxIdentification;
	}
	public void setTaxIdentification(String taxIdentification) {
		this.taxIdentification = taxIdentification;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
		
}
