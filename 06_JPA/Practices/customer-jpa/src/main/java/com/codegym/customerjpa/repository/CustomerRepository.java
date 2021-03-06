package com.codegym.customerjpa.repository;

import com.codegym.customerjpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAllByNameContaining(String name);
}
