package com.rakhi.sales.web.dto;

public class Userregdto {
	private String name;
	private String email;
	private String password;
	private long phnum;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Userregdto(String name, String email, String password, long phnum, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phnum = phnum;
		this.address = address;
	}
		
	
}