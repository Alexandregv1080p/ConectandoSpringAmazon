package com.example.dioclass.apirest.ApiRest.Repository;

import com.example.dioclass.apirest.ApiRest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
