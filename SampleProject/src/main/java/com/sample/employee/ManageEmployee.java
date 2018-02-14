package com.sample.employee;

import static java.util.UUID.randomUUID;

public class ManageEmployee {

    EmployeeService service;

    // calling external service
    public Employee addEmployee(Employee emp){
        return service.addEmployee(emp);
    }

    // calling external service
    public Employee getEmpOfDepartment(Department dep){
        return service.getEmpOfDepartment(dep);
    }

    // returning new random employee with random name
    public Employee randomEmployee(){
        return new Employee(randomUUID().toString());
    }

}
