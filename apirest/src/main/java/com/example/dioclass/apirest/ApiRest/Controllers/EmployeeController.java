package com.example.dioclass.apirest.ApiRest.Controllers;

import com.example.dioclass.apirest.ApiRest.Entity.Employee;
import com.example.dioclass.apirest.ApiRest.Repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping("/employees")
    public List<Employee> listOfEmployees(){
        return employeeRepository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmpId(@PathVariable Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoudExc(id));
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeRepository.findById(id).map(employee1 -> {
            employee1.setName(employee.getName());
            employee1.setAddress(employee.getAddress());
            employee1.setRole(employee.getRole());
            return employeeRepository.save(employee);
        }).orElseGet(()->{
            employee.setId(id);
            return employeeRepository.save(employee);
        });
    }
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }


}
