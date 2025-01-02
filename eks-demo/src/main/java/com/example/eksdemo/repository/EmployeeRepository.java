package com.example.eksdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eksdemo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
}
