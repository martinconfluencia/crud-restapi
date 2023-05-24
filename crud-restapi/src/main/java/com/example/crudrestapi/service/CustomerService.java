package com.example.crudrestapi.service;

import com.example.crudrestapi.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer add(Customer customer);

    Customer update(Customer customer);

    void delete(Long id);

    Customer detail(Long id);

    List<Customer> list();
}
