package com.glgxx.repository;


import com.glgxx.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by crazyStone on 2018-11-06.
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByUsername(String username);
}
