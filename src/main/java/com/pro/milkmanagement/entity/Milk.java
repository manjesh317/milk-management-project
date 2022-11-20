package com.pro.milkmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Milk {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long rId;
	private Float quantity;	
	private Boolean isPaid;
	private Float price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Milk [id=" + id + ", rId=" + rId + ", quantity=" + quantity + ", isPaid=" + isPaid + ", price=" + price
				+ "]";
	}	
	

}
