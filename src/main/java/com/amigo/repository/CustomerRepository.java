package com.amigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amigo.model.Customer;

public interface CustomerRepository 
        extends JpaRepository<Customer,Integer>{
    
}
