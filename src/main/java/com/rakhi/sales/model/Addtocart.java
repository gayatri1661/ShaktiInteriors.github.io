package com.rakhi.sales.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="addtocart")
public class Addtocart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long productid;
	private int qnty;
	private double price;
	private String date;
	private long userid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProduct_id() {
		return productid;
	}
	public void setProduct_id(long productid) {
		this.productid = productid;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
