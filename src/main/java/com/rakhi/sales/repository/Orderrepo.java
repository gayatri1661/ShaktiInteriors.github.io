package com.rakhi.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakhi.sales.model.Order;
@Repository
public interface Orderrepo extends JpaRepository<Order,Long>{

}
