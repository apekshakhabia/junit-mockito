package com.sample.employee;

public class Department {

    private Employee emp;


    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Department(Employee emp){
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
            "emp=" + emp +
            '}';
    }
}
