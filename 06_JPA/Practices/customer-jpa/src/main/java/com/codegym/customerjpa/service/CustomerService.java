package com.codegym.customerjpa.service;

import com.codegym.customerjpa.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void update(Customer customer);

    void remove(int id);

    void remove(String name);
}
