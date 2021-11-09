package com.example.CourseApplication.repositories;

import com.example.CourseApplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
