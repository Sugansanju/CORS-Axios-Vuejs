package com.dexter.backend.service;

import java.util.List;

import com.dexter.backend.model.Customer;

public interface UserService {
	public List<Customer> getAllCustomer();
  	public Customer getById(int id);
	public Customer findByEmail(String email,String password);
	public boolean validate(String email,String password);
  	public boolean add(Customer customer);
  	public int save(Customer customer); 
  	public void update(Customer customer);
  	public void delete(int id);
}
