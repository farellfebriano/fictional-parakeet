package com.mini_data_hub.mini_data_hub.repository;

import com.mini_data_hub.mini_data_hub.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
