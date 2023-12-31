package com.bnta.capstone.controllers;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;



//    GET ALL
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments(){
        return new ResponseEntity<>(departmentService.findAllDepartments(), HttpStatus.OK);
    }


//    GET DEPARTMENT BY ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable int id) {
        Department foundDepartment = departmentService.findDepartmentById(id);
        return new ResponseEntity<>(foundDepartment, HttpStatus.OK);
    }

//    GET DEPARTMENT NAMES

}
