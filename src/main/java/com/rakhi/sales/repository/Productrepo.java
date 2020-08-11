package com.rakhi.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakhi.sales.model.Products;

@Repository
public interface Productrepo extends JpaRepository<Products,Long>{

}
