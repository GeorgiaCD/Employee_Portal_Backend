package com.bnta.capstone.services;

import com.bnta.capstone.models.Employee;
import com.bnta.capstone.models.LoginDTO;
import com.bnta.capstone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Boolean checkLoginDetails(LoginDTO login) {
        Employee employee = employeeRepository.findByEmail(login.getEmail());

        if(employee!=null){
            if(employee.getPassword().equals(login.getPassword())){
                return true;
            }
            else {return false;}
            }
        return false;
    }

    public Employee findEmployeeByEmail(LoginDTO login) {
    return employeeRepository.findByEmail(login.getEmail());
    }

    }

