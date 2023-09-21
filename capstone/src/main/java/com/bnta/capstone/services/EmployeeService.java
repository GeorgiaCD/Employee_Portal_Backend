package com.bnta.capstone.services;

import com.bnta.capstone.models.Employee;
import com.bnta.capstone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    // get employee by id
    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }



    // get employees by department

//    public List<Employee> getEmployeeByDepartment(){
//       // find by department name or id??
//    }


}
