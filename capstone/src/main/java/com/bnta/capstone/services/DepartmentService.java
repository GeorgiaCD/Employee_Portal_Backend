package com.bnta.capstone.services;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.repositories.DepartmentRepository;
import com.bnta.capstone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;


    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findLeadEmployee(int id){
        return this.employeeRepository.findById(id).get();
    }

    public Department findDepartmentName(int id){
        return this.departmentRepository.findById(id).get();
    }

    
}
