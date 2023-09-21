package com.bnta.capstone.repositories;

import com.bnta.capstone.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDepartmentId(int id);
}
