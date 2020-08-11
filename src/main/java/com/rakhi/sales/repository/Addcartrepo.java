package com.rakhi.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rakhi.sales.model.Addtocart;
@Repository
public interface Addcartrepo extends JpaRepository<Addtocart,Long>{
}
