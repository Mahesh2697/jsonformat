package com.employees.jsonformat.controller;


import com.employees.jsonformat.model.EmployeeModel;
import com.employees.jsonformat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-employee")
    public void add(@RequestBody EmployeeModel employeeModel){
        employeeService.addEmployee(employeeModel);
    }

    @GetMapping("/get-all-employees")
    public List<EmployeeModel> getAll(){
        return employeeService.getAllEmployees();
    }


}
