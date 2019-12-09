package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Position;
import java.util.List;

public interface EmployeeService extends Service<Employee> {
    List<Employee> findAllByAgeAndPosition(Integer age, Position position);
}