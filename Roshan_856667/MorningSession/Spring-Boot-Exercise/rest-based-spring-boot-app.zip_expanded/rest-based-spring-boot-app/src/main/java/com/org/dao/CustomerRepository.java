package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
