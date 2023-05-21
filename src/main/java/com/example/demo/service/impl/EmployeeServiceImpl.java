package com.example.demo.service.impl;

import com.example.demo.error.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()) {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id) {
//        return employeeList
//                .stream()
//                .filter(employee -> employee.getEmployeeId().equals(id))
//                .findFirst()
//                .get();
//        return employeeList
//                .stream()
//                .filter(employee -> employee.getEmployeeId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
        return employeeList
                .stream()
                .filter(employee -> employee.getEmployeeId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }
}
