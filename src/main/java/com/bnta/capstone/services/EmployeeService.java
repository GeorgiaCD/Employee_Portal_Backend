package com.bnta.capstone.services;

import com.bnta.capstone.models.Employee;
import com.bnta.capstone.models.LoginDTO;
import com.bnta.capstone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // get all employees
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }


    // get employee by id
    public Employee findEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }



    // get employees by department id
    public List<Employee> findEmployeesByDepartment(int id){
       return employeeRepository.findByDepartmentId(id);
    }

    // check password from email
    public Employee checkLoginDetails(LoginDTO login){
        // check if email exist in the database
            // if not return message    "No user found matching these details"
        // check that the password matches the corresponding password for the email
            // if not return message    "No user found matching these details"
        // return an employee object if so
        

    }
}
