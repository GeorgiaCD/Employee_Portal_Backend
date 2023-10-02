# Employee Portal - BACKEND END Restful API

## **_Collaborators_**

- Georgia Crawford-Dellar (GitHub: [GeorgiaCD](https://github.com/GeorgiaCD))
- Francesca (GitHub: [Francescam31](https://github.com/Francescam31))
- Amélie (GitHub: [amelieboydshire](https://github.com/amelieboydshire))
- Blezzy Dela Cruz (GitHub: [blezzydcruz](https://github.com/blezzydcruz))

<hr></hr>

1. [Description](#description)
2. [Models](#models)
3. [ERD](#ERD)
4. [UML class diagram](#components-diagram)
5. [Service Layers](#wireframe)
6. [Restful routes](#api)
7. [REACT APP](#demon-video)
8. [Screenshots](#screenshots)
9. [Tech Stack](#tech-stack)


## Description 
## Models
## ERD
### UML class diagram 
### Service level 



## How to use the API 
### Restful routes
|Controller | Mapping |Path | Description | Output | 
|----------|-----------|------|-------------|--------|
|Department|GET|http://localhost:8080/departments|index route|returns all department objects|
||GET|http://localhost:8080/departments/{id}|show route|returns department object with id= {id} |
|Employee|GET|http://localhost:8080/employees|index route|returns all employee objects|
||GET|http://localhost:8080/employees/{id}|show route|returns employee object with id= {id}|
|       |GET|http://localhost:8080/employees/department/{id}||returns list of employee objects where department id={id}|
|       |POST|http://localhost:8080/employees/login|request body: loginDTO = email , password |returns the logged in employee object|
|    Shift   |GET|http://localhost:8080/shifts|index route|returns all shift objects|
|       |GET|http://localhost:8080/shifts/{id}|show route|returns shift object with id= {id}|
|       |GET|http://localhost:8080/shifts/dto||returns a shift dto object in the form |
|       |GET|http://localhost:8080/shifts/employee/{id}||returns all the shift objects assigned to employeeid ={id}|
|       |GET|http://localhost:8080/shifts/{type}|**|returns shift objects with type= {type}|
|       |GET|http://localhost:8080/shifts/{date}|**|returns shift objects with date= {date}|
|       |POST|http://localhost:8080/shifts|request body: shiftDTO = date, type, employeeId|returns the shift object that was just created|





## React app 
## 
## Tech stack
##