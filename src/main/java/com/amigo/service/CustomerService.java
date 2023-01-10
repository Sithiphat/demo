package com.amigo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amigo.model.Customer;
import com.amigo.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    
    
    
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    
    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }

 

 
    public void addCustomer(Customer customer){
        // Customer customer = new Customer();
        // customer.setName(name);
        // customer.setEmail(email);
        // customer.setAge(age);
        customerRepository.save(customer);
    }
   
    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }

   
    public void updateCustomer( Integer id, Customer updatedCustomer){
        Customer customer = customerRepository.findById(id).get();
        customer.setName( updatedCustomer.getName());
        customer.setEmail( updatedCustomer.getEmail());
        customer.setAge( updatedCustomer.getAge());
        customerRepository.save(customer);
      

    }
}
