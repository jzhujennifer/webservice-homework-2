package com.example.restservice.service;

import com.example.restservice.model.Employee;
import com.example.restservice.model.Address;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){
        Employee employee1 = new Employee(1,"Jack","Smith",25,new Address(12,"Perrot","J1A 2B5"));
        Employee employee2 = new Employee(2,"Jim","Zhu",28,new Address(15,"Brook","J2A 2B6"));
        Employee employee3 = new Employee(3,"Emma","Wang",29,new Address(17,"George","J3A 2x7"));


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;

    }

    public Employee getById(int id){
        for(Employee e : employees){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }
    public void addEmployee(Employee employee){
       employees.add(employee);
    }


}
