package com.employees.jsonformat.service;

import com.employees.jsonformat.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

        private List<EmployeeModel> employeeModel = new ArrayList<>();
        public void addEmployee(EmployeeModel employee) {
            employeeModel.add(employee);
        }

    public List<EmployeeModel> getAllEmployees() {
        return  employeeModel;
    }
}

