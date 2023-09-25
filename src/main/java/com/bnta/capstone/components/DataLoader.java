package com.bnta.capstone.components;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.models.Shift;
import com.bnta.capstone.repositories.DepartmentRepository;
import com.bnta.capstone.repositories.EmployeeRepository;
import com.bnta.capstone.repositories.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

import static com.bnta.capstone.models.JobTitle.*;
import static com.bnta.capstone.models.Type.*;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ShiftRepository shiftRepository;

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

        departmentRepository.saveAll(Arrays.asList(department1, department2, department3, department4, department5, department6));

//        Employees
//        Managers
        Employee manager1 = new Employee("Jane", "Jane@email.com", "1234", "+44958572904", SOFTWARE_ENGINEER, department1, 50, true);
        Employee manager2 = new Employee("Patricia", "Patricia@email.com", "1234", "+44958572771", FINANCE_ANALYST, department2, 35, true);
        Employee manager3 = new Employee("Stacy", "Stacy@email.com", "1234", "+44953764889", WAREHOUSE_ASSOCIATE, department3, 40, true);
        Employee manager4 = new Employee("Lisa", "Lisa@email.com", "1234", "+44896764997", HR_SPECIALIST, department4, 30, true);
        Employee manager5 = new Employee("Bob", "Bob@email.com", "1234", "+44953756442", MARKETING_MANAGER, department5, 45, true);
        Employee manager6 = new Employee("Sam", "Sam@email.com", "1234", "+44998465481", CUSTOMER_SERVICE_ASSOCIATE, department6, 30, true);

//        Non-Managerial Staff
        Employee employee1 = new Employee("Christina", "Christina@email.com", "9876", "+4495834604", SOFTWARE_ENGINEER, department1, 40, false);
        Employee employee2 = new Employee("Fatima", "Fatima@email.com", "9876", "+448642650277", FINANCE_ANALYST, department2, 32, false);
        Employee employee3 = new Employee("Joshua", "Joshua@email.com", "9876", "+449536349802", WAREHOUSE_ASSOCIATE, department3, 40, false);
        Employee employee4 = new Employee("Kai", "Kai@email.com", "9876", "+442460363490", HR_SPECIALIST, department4, 25, false);
        Employee employee5 = new Employee("Mark", "Mark@email.com", "9876", "+443371608374", SOLUTIONS_ARCHITECT, department5, 40, false);
        Employee employee6 = new Employee("Dani", "Dani@email.com", "9876", "+447662901805", SOLUTIONS_ARCHITECT, department6, 25, false);

        employeeRepository.saveAll(Arrays.asList(manager1, manager2, manager3, manager4, manager5, manager6, employee1, employee2, employee3, employee4, employee5, employee6));


//    Shifts

        Shift shift1 = new Shift(LocalDate.of(2023,9,01), MORNING, manager1);
        Shift shift2 = new Shift(2023-9-02, MORNING, manager1);
        Shift shift3 = new Shift(2023-09-03, MORNING, manager1 );
        Shift shift4 = new Shift(2023-09-04, MORNING,  );
        Shift shift5 = new Shift(2023-09-05, MORNING,  );
        Shift shift6 = new Shift(2023-09-06, MORNING,  );
        Shift shift7 = new Shift(2023-09-07, MORNING,  );
        Shift shift8 = new Shift(2023-09-08, MORNING,  );
        Shift shift9 = new Shift(2023-09-09, MORNING,  );
        Shift shift10 = new Shift(2023-09-10, MORNING,  );
        Shift shift11 = new Shift(2023-09-11, MORNING,  );
        Shift shift12 = new Shift(2023-09-12, MORNING,  );
        Shift shift13 = new Shift(2023-09-13, MORNING,  );
        Shift shift14 = new Shift(2023-09-14, MORNING,  );
        Shift shift15 = new Shift(2023-09-15, MORNING,  );



    }


}
