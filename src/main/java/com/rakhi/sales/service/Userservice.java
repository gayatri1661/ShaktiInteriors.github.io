package com.rakhi.sales.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rakhi.sales.model.Sale;
import com.rakhi.sales.web.dto.Userregdto;

public interface Userservice extends UserDetailsService {
	Sale save(Userregdto registerdto);

}
