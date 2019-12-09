package com.example.demo.controller.employee;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Position;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/employee/{id}/update")
public class UpdateEmployee {
    private final PositionService positionService;
    private final EmployeeService employeeService;

    public UpdateEmployee(PositionService positionService, EmployeeService employeeService) {
        this.positionService = positionService;
        this.employeeService = employeeService;
    }

    @GetMapping
    public String add(Model model, @PathVariable Integer id){
        model.addAttribute("employee", getEmployee(id).orElse(new Employee()));
        model.addAttribute("position", findAll());
        return "addEmployee";
    }

    private List<Position> findAll(){
        return positionService.findAll();
    }

    private Optional<Employee> getEmployee(Integer id){
        return employeeService.findById(id);
    }

    @PostMapping
    public String update(Employee employee){
        employeeService.save(employee);
        return "redirect:/";
    }
}
