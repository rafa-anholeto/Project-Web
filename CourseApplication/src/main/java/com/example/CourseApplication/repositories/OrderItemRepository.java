package com.example.CourseApplication.repositories;

import com.example.CourseApplication.entities.OrderItem;
import com.example.CourseApplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
