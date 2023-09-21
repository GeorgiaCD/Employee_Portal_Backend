package com.bnta.capstone.controllers;

import com.bnta.capstone.models.Employee;
import com.bnta.capstone.services.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //    INDEX
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity<>(employeeService.findAllEmployees(), HttpStatus.OK);
    }

    //    SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

//     Get employee by departmentId
    @GetMapping(value = "/department/{id}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartmentId(int id){
        List<Employee> departmentEmployees = employeeService.findEmployeesByDepartment(id);
        return new ResponseEntity<>(departmentEmployees, HttpStatus.OK);
    }


}