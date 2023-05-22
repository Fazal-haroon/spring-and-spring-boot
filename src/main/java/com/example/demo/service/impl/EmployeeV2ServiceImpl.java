package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService {
    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}
