package org.yup.OnlineStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yup.OnlineStore.models.Customer;
import org.yup.OnlineStore.models.Employee;
import org.yup.OnlineStore.services.CustomerService;
import org.yup.OnlineStore.services.EmployeeService;

import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("api/employee")
    public List<Employee> getAllEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("api/employee")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeService.createEmployee(employee);
    }

    @GetMapping("api/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long Id){
        return this.employeeService.getEmployeeById(Id);
    }

    @GetMapping("api/employee/name")
    public Employee getEmployeeByName(@RequestParam("name") String name){
        return this.employeeService.getEmployeeByName(name);
    }

    @DeleteMapping("api/employee/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long Id){
        this.employeeService.deleteEmployee(Id);
    }

    @PutMapping("api/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long Id){
        return this.employeeService.updateEmployee(employee, Id);
    }
}
