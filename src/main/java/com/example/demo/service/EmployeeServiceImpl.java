package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Position;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService {
    @Override
    public List<Employee> findAllByAgeAndPosition(Integer age, Position position) {
        return null;
    }

    @Override
    public Employee save(Employee entity) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer id) {
        return false;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
