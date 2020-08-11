package com.rakhi.sales.service;

import java.util.Arrays;


import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rakhi.sales.model.Role;
import com.rakhi.sales.model.Sale;
import com.rakhi.sales.repository.Userrepository;
import com.rakhi.sales.web.dto.Userregdto;

@Service
public class Userserimpl implements Userservice{
	
	@Autowired
	private BCryptPasswordEncoder passw;
	
	
	private Userrepository userrepo;


	private Userregdto registerdto;

	public Userserimpl(Userrepository userrepo) {
		super();
		this.userrepo = userrepo;
	}


	@Override
	public Sale save(Userregdto registerdto) {
		Sale sale=new Sale(registerdto.getName(),registerdto.getEmail(),passw.encode(registerdto.getPassword()),registerdto.getPhnum(),
				registerdto.getAddress(),Arrays.asList(new Role("ROLE_USER")));
		
		return userrepo.save(sale);
	}


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Sale sale =userrepo.findByname(email);
		if(sale==null) {
			throw new UsernameNotFoundException("Invalid Emailid");
		}
		return new org.springframework.security.core.userdetails.User(sale.getEmail(),sale.getPassword(),mapRolesToAuthorities(sale.getRoles()));

	}
	
	private Collection <? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
	
	

}
	