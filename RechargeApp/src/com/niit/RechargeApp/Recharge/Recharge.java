package com.niit.RechargeApp.Recharge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Recharge {
 
   
    private int price;
    private String details;
    private int validity;
 
    protected Recharge() {
    }
 
    protected Recharge(int price, String details, int validity) {
        this.price = price;
        this.details = details;
        this.validity = validity;
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}
 
}