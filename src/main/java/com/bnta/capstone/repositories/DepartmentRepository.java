package com.bnta.capstone.repositories;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

//    FIND LEAD EMPLOYEE BY DEPARTMENT ID
//    Optional<Employee> findLeadEmployeeByDepartmentId(int id);
}
