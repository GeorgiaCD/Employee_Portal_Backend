package com.bnta.capstone.components;

import com.bnta.capstone.models.Department;
import com.bnta.capstone.models.Employee;
import com.bnta.capstone.models.Message;
import com.bnta.capstone.models.Shift;
import com.bnta.capstone.repositories.DepartmentRepository;
import com.bnta.capstone.repositories.EmployeeRepository;
import com.bnta.capstone.repositories.MessageRepository;
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

    @Autowired
    MessageRepository messageRepository;

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
        Employee manager1 = new Employee("Jane", "Jane@email.com", "1", "+44958572904", SOFTWARE_ENGINEER, department1, 50, true);
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
        Employee employee5 = new Employee("Mark", "Mark@email.com", "9876", "+443371608374", SOLUTIONS_ARCHITECT, department1, 40, false);
        Employee employee6 = new Employee("Dani", "Dani@email.com", "9876", "+447662901805", SOLUTIONS_ARCHITECT, department6, 25, false);
        Employee employee7 = new Employee("Samson", "Samson@email.com", "9876", "+447662901605", LAWYER, department1, 55, false);

        employeeRepository.saveAll(Arrays.asList(manager1, manager2, manager3, manager4, manager5, manager6, employee1, employee2, employee3, employee4, employee5, employee6,employee7));


//    Shifts
// morning shifts
        Shift morningShift1 = new Shift(LocalDate.of(2023,9,01), MORNING, manager1);
        Shift morningShift2 = new Shift(LocalDate.of(2023,9,02), MORNING, manager1);
        Shift morningShift3 = new Shift(LocalDate.of(2023,9,03), MORNING, manager1 );
        Shift morningShift4 = new Shift(LocalDate.of(2023,9,04), MORNING, manager2 );
        Shift morningShift5 = new Shift(LocalDate.of(2023,9,27), MORNING, employee1 );
        Shift morningShift6 = new Shift(LocalDate.of(2023,9,06), MORNING, employee2 );
        Shift morningShift7 = new Shift(LocalDate.of(2023,9,07), MORNING, employee2  );
        Shift morningShift8 = new Shift(LocalDate.of(2023,9,8), MORNING, employee6 );
        Shift morningShift9 = new Shift(LocalDate.of(2023,9,9), MORNING, employee5  );
        Shift morningShift10 = new Shift(LocalDate.of(2023,9,10), MORNING,manager5  );


        Shift morningShift11 = new Shift(LocalDate.of(2023,9,01), MORNING,manager2 );
        Shift morningShift12 = new Shift(LocalDate.of(2023,9,03), MORNING, employee1 );
        Shift morningShift13 = new Shift(LocalDate.of(2023,9,05), MORNING, employee2);
        Shift morningShift14 = new Shift(LocalDate.of(2023,9,06), MORNING, employee5 );
        Shift morningShift15 = new Shift(LocalDate.of(2023,9,9), MORNING, employee4 );
        Shift morningShift16 = new Shift(LocalDate.of(2023,9,10), MORNING,  employee6 );
        Shift morningShift17 = new Shift(LocalDate.of(2023,9,11), MORNING, employee3 );
        Shift morningShift18 = new Shift(LocalDate.of(2023,9,12), MORNING, manager3 );
        Shift morningShift19 = new Shift(LocalDate.of(2023,9,13), MORNING, manager4 );
        Shift morningShift20 = new Shift(LocalDate.of(2023,9,14), MORNING, manager5 );


// afternoon shifts
        Shift afternoonShift1 = new Shift(LocalDate.of(2023,9,01), AFTERNOON,manager3 );
        Shift afternoonShift2 = new Shift(LocalDate.of(2023,9,02), AFTERNOON, employee1 );
        Shift afternoonShift3 = new Shift(LocalDate.of(2023,9,03), AFTERNOON, employee3 );
        Shift afternoonShift4 = new Shift(LocalDate.of(2023,9,04), AFTERNOON, employee4 );
        Shift afternoonShift5 = new Shift(LocalDate.of(2023,9,05), AFTERNOON, manager6);
        Shift afternoonShift6 = new Shift(LocalDate.of(2023,9,06), AFTERNOON, employee4 );
        Shift afternoonShift7 = new Shift(LocalDate.of(2023,9,07), AFTERNOON, employee6 );
        Shift afternoonShift8 = new Shift(LocalDate.of(2023,9,8), AFTERNOON, manager3 );
        Shift afternoonShift9 = new Shift(LocalDate.of(2023,9,9), AFTERNOON,  employee1);
        Shift afternoonShift10 = new Shift(LocalDate.of(2023,9,10), AFTERNOON, employee1 );


        Shift afternoonShift11 = new Shift(LocalDate.of(2023,9,11), AFTERNOON, employee2 );
        Shift afternoonShift12 = new Shift(LocalDate.of(2023,9,12), AFTERNOON, manager6);
        Shift afternoonShift13 = new Shift(LocalDate.of(2023,9,13), AFTERNOON,manager5 );
        Shift afternoonShift14 = new Shift(LocalDate.of(2023,9,14), AFTERNOON, employee1 );
        Shift afternoonShift15 = new Shift(LocalDate.of(2023,9,05), AFTERNOON, employee2 );
        Shift afternoonShift16 = new Shift(LocalDate.of(2023,9,16), AFTERNOON,employee6  );
        Shift afternoonShift17 = new Shift(LocalDate.of(2023,9,07), AFTERNOON,employee3  );
        Shift afternoonShift18 = new Shift(LocalDate.of(2023,9,18), AFTERNOON, employee5  );
        Shift afternoonShift19 = new Shift(LocalDate.of(2023,9,19), AFTERNOON,manager1 );
        Shift afternoonShift20 = new Shift(LocalDate.of(2023,9,10), AFTERNOON, manager6 );


// evening shifts
        Shift eveningShift1 = new Shift(LocalDate.of(2023,9,01), EVENING, employee4 );
        Shift eveningShift2 = new Shift(LocalDate.of(2023,9,02), EVENING, employee6);
        Shift eveningShift3 = new Shift(LocalDate.of(2023,9,03), EVENING, employee3 );
        Shift eveningShift4 = new Shift(LocalDate.of(2023,9,04), EVENING, manager2 );
        Shift eveningShift5 = new Shift(LocalDate.of(2023,9,05), EVENING,  employee4);
        Shift eveningShift6 = new Shift(LocalDate.of(2023,9,06), EVENING, employee5 );
        Shift eveningShift7 = new Shift(LocalDate.of(2023,9,07), EVENING, employee6 );
        Shift eveningShift8 = new Shift(LocalDate.of(2023,9,8), EVENING, manager2  );
        Shift eveningShift9 = new Shift(LocalDate.of(2023,9,9), EVENING, manager1 );
        Shift eveningShift10 = new Shift(LocalDate.of(2023,9,10), EVENING, manager6  );


        Shift eveningShift11 = new Shift(LocalDate.of(2023,9,01), EVENING,manager5 );
        Shift eveningShift12 = new Shift(LocalDate.of(2023,9,12), EVENING,manager6 );
        Shift eveningShift13 = new Shift(LocalDate.of(2023,9,13), EVENING, employee1 );
        Shift eveningShift14 = new Shift(LocalDate.of(2023,9,14), EVENING,  employee2);
        Shift eveningShift15 = new Shift(LocalDate.of(2023,9,15), EVENING, employee3 );
        Shift eveningShift16 = new Shift(LocalDate.of(2023,9,06), EVENING, employee6 );
        Shift eveningShift17 = new Shift(LocalDate.of(2023,9,07), EVENING, employee4 );
        Shift eveningShift18 = new Shift(LocalDate.of(2023,9,18), EVENING, employee5 );
        Shift eveningShift19 = new Shift(LocalDate.of(2023,9,9), EVENING, manager3 );
        Shift eveningShift20 = new Shift(LocalDate.of(2023,9,10), EVENING, manager4  );

//        jane shifts
        Shift morningShift21 = new Shift(LocalDate.of(2023,10,06), MORNING, manager1);
        Shift morningShift22 = new Shift(LocalDate.of(2023,10,02), MORNING, manager1);
        Shift morningShift23 = new Shift(LocalDate.of(2023,10,03), MORNING, manager1 );
        Shift morningShift24 = new Shift(LocalDate.of(2023,10,04), MORNING, manager1 );
        Shift morningShift25 = new Shift(LocalDate.of(2023,10,05), MORNING,manager1);

       shiftRepository.saveAll(Arrays.asList(morningShift1, morningShift2, morningShift3, morningShift4, morningShift5, morningShift6, morningShift7, morningShift8, morningShift9, morningShift10, morningShift11, morningShift12, morningShift13, morningShift14, morningShift15, morningShift16, morningShift17, morningShift18, morningShift19, morningShift20));

       shiftRepository.saveAll(Arrays.asList(afternoonShift1, afternoonShift2, afternoonShift3, afternoonShift4, afternoonShift5, afternoonShift6, afternoonShift7, afternoonShift8, afternoonShift9, afternoonShift10, afternoonShift11, afternoonShift12, afternoonShift13, afternoonShift14, afternoonShift15, afternoonShift16, afternoonShift17, afternoonShift18, afternoonShift19, afternoonShift20));

        shiftRepository.saveAll(Arrays.asList(eveningShift1, eveningShift2, eveningShift3, eveningShift4, eveningShift5, eveningShift6, eveningShift7, eveningShift8, eveningShift9, eveningShift10, eveningShift11, eveningShift12, eveningShift13, eveningShift14, eveningShift15, eveningShift16, eveningShift17, eveningShift18, eveningShift19, eveningShift20));

        shiftRepository.saveAll(Arrays.asList(morningShift21,morningShift22, morningShift23, morningShift24, morningShift25));


//        messages
        Message message1 = new Message("hello","god");
        Message message2 = new Message("hello again","god");

        messageRepository.saveAll(Arrays.asList(message1, message2));


    }




}
