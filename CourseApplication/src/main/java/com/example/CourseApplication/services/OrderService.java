package com.example.CourseApplication.services;

import com.example.CourseApplication.entities.Order;
import com.example.CourseApplication.entities.User;
import com.example.CourseApplication.repositories.OrderRepository;
import com.example.CourseApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
