package com.sprintcode.ecommerce.dao;

import com.sprintcode.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
