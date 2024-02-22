package com.jaisoft.archiunit.service.implementation;

import com.jaisoft.archiunit.repository.EmployeeRepository;
import com.jaisoft.archiunit.domain.Employee;
import com.jaisoft.archiunit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        employeeRepository = this.employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        this.employeeRepository.deleteById(id);
    }



}