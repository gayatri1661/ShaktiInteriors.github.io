package com.rakhi.sales.service;

import java.util.List;

import com.rakhi.sales.model.Addtocart;

public interface Cartservice{
	List<Addtocart> addcartbyUserandproductid(long productid,long userid);
	List<Addtocart> getcartbyuserid(long userid);
	List<Addtocart> removecart(long cartid,long userid);
}
