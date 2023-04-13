package com.example.dioclass.apirest.Hateoas.Repository;

import com.example.dioclass.apirest.Hateoas.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
