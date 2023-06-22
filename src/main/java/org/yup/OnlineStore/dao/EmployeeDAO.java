package org.yup.OnlineStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yup.OnlineStore.models.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    public Employee getEmployeeByName(String name);
}
