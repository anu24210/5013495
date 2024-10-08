package com.example.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData;

    public CustomerRepositoryImpl() {
        customerData = new HashMap<>();
      
        customerData.put("1", new Customer("1", "John Doe"));
        customerData.put("2", new Customer("2", "Jane Doe"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}