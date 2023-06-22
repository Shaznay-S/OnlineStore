package org.yup.OnlineStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yup.OnlineStore.dao.EmployeeDAO;
import org.yup.OnlineStore.dao.FulfillmentCenterDAO;
import org.yup.OnlineStore.models.Employee;
import org.yup.OnlineStore.models.FulfillmentCenter;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getAllEmployees(){
        return this.employeeDAO.findAll();
    }

    public Employee getEmployeeById(Long Id){
        return this.employeeDAO.findById(Id).orElse(new Employee());
    }

    public Employee getEmployeeByName(String name){
        return this.employeeDAO.getEmployeeByName(name);
    }

    public Employee createEmployee(Employee employee){
        return this.employeeDAO.save(employee);
    }

    public Employee updateEmployee(Employee employee, Long Id){
        Employee employeeToUpdate = this.employeeDAO.findById(Id).orElse(null);

        if(employeeToUpdate == null){
            return new Employee();
        }

        employeeToUpdate.setName(employeeToUpdate.getName());
        employeeToUpdate.setTitle(employeeToUpdate.getTitle());
        employeeToUpdate.setDepartment(employeeToUpdate.getDepartment());
        employeeToUpdate.setEMail(employeeToUpdate.getEMail());
        employeeToUpdate.setPassword(employeeToUpdate.getPassword());

        return this.employeeDAO.save(employeeToUpdate);

    }

    public void deleteEmployee(Long Id){
        this.employeeDAO.deleteById(Id);
    }
}

