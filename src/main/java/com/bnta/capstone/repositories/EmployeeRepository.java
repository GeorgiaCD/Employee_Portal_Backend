package com.bnta.capstone.repositories;

import ch.qos.logback.core.model.conditional.ElseModel;
import com.bnta.capstone.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDepartmentId(int id);

    Employee findByEmail(String email);
    Employee findByPassword(String password);
}
