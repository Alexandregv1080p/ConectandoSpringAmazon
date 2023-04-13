package com.example.dioclass.apirest.Hateoas.Repository;

import com.example.dioclass.apirest.ApiRest.Entity.Employee;
import com.example.dioclass.apirest.Hateoas.Entity.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryHateoas extends JpaRepository<EmployeeHateoas,Long> {
}
