package com.jaisoft.archiunit.controller;

import com.jaisoft.archiunit.domain.Employee;
import com.jaisoft.archiunit.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController (EmployeeService employeeService) {
        employeeService  = this.employeeService;
    }



    @GetMapping()
    public List<Employee> showNewEmployeeForm() {
        return employeeService.getAll();

    }

    @PostMapping()
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") long id) {
        return employeeService.getById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

}