package com.bnta.capstone.controllers;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.services.DepartmentService;
import com.bnta.capstone.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

//    SHOW ROUTE

//    GET LEAD EMPLOYEE
    @GetMapping(value = "/lead_employee/{id}")
    public ResponseEntity<Optional<Employee>> getLeadEmployeeByDepartmentId(@PathVariable int id) {
        Optional<Employee> foundLeadEmployee = departmentService.findLeadEmployeeByDepartmentId(id);
        return new ResponseEntity<>(foundLeadEmployee, HttpStatus.OK);
    }

//    GET DEPARTMENT NAME
    @GetMapping(value = "/{id}")
    public ResponseEntity<Department> getDepartmentName(@PathVariable int id) {
        Department foundDepartment = departmentService.findDepartmentName(id);
        return new ResponseEntity<>(foundDepartment, HttpStatus.OK);
    }
}
