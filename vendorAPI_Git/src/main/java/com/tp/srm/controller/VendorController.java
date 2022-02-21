package com.tp.srm.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.srm.entities.Vendor;

@RestController
public class VendorController {

	// Global Public Data declarations
	public HashMap<String, Vendor> i_vendors = new HashMap<>();

	@Autowired
	Vendor vendor001;
	// @Autowired
	Vendor vendor002 = new Vendor("BP10010", "Tetra Pak Singapore Pte. Ltd.", "19, Gul Lane","","","Singapore West","APAC","Singapore","VenuMadhav Gajjala","VenuMadhav.Gajjala@tetrapak.com","SG19801010","+65 92504914",new Date());
	//@Autowired
	Vendor vendor003 = new Vendor("BP10011", "Tetra Pak Lund", "Ruben Rausings gata 2","223 55 Lund","","Lund","EU","Sweden","Nadar Ponsamuel","Nadar.Ponsamuel@tetrapak.com","SE19809000","+46 46 36 10 00",new Date());

	// Get Vendor information
	@RequestMapping("/A_Vendor")
	public HashMap<String, Vendor> getVendors(){
		fillVendors();
		return i_vendors;
	}

	//Get Particular Vendor Information (Single entity)
	@RequestMapping("/A_Vendor/{vendorCode}")
	public Vendor getVendorByCode(@PathVariable("vendorCode") String vendorCode) {
		fillVendors();
		return i_vendors.get(vendorCode);
	}

	//Post new Vendor Information to JSON
	@PostMapping("/A_Vendor")
	public Vendor createVendor(@RequestBody Vendor postBody) {
		i_vendors.put(postBody.code, postBody);
		return postBody;
	}

	private void fillVendors() {
		// TODO Auto-generated method stub
		i_vendors.put(vendor001.code, vendor001);
		i_vendors.put(vendor002.code, vendor002);
		i_vendors.put(vendor003.code, vendor003);
	}
}
