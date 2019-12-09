package com.example.demo.controller.employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee/{id}/delete")
public class DeleteEmployee {
    private final EmployeeService employeeService;

    public DeleteEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String deleteHotel(@PathVariable Integer id) {
        employeeService.deleteById(id);
        return "redirect:/view/hotel";
    }
}
