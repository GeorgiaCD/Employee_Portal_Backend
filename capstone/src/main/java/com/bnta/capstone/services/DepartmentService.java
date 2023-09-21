package com.bnta.capstone.services;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    public Optional<Employee> findLeadEmployeeByDepartmentId(int id){
        return this.departmentRepository.findLeadEmployeeByDepartmentId(id);
    }

    public Department findDepartmentName(int id){
        return this.departmentRepository.findById(id).get();
    }

    
}
