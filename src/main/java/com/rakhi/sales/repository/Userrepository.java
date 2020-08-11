package com.rakhi.sales.repository;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakhi.sales.model.Sale;

@Repository
public interface Userrepository extends JpaRepository<Sale ,Long> {
	Sale findByname(String email);

}
