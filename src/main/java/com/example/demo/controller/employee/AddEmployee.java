package com.example.demo.controller.employee;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Position;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/employee/add")
public class AddEmployee {

    private final EmployeeService employeeService;
    private final PositionService positionService;

    @GetMapping
    public String add(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("position", findAll());
        return "addEmployee";
    }

    private List<Position> findAll() {
        return positionService.findAll();
    }

    private Optional<Position> findPosition(Integer id){
        return positionService.findById(id);
    }

    @PostMapping
    public String saveNew(Employee employee){
        findPosition(employee.getPosition().getId()).ifPresent(employee::setPosition);
        employeeService.save(employee);
        return "redirect:/";
    }
}
