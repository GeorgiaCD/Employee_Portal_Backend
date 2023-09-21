package com.bnta.capstone.components;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.repositories.DepartmentRepository;
import com.bnta.capstone.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static com.bnta.capstone.models.JobTitle.SOFTWARE_ENGINEER;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//      Departments
        Department department1 = new Department("Legal");
        Department department2 = new Department("Finance");
        Department department3 = new Department("Warehouse");
        Department department4 = new Department("Human Resources");
        Department department5 = new Department("Marketing");
        Department department6 = new Department("Customer Service");


//        Employee
        Employee employee1 = new Employee("Jane","Jane@email.com","1234","+44958572904",SOFTWARE_ENGINEER,department1,50,null);

//        add lead employee to department
//        department.addLeademployee(Employee)
    }


    


}
