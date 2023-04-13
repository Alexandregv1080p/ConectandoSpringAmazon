package com.example.dioclass.apirest.ApiRest;

import com.example.dioclass.apirest.ApiRest.Entity.Employee;
import com.example.dioclass.apirest.ApiRest.Repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBD {
    private static final Logger log = LoggerFactory.getLogger(LoadBD.class);
    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository)throws Exception{
        return args -> {
            log.info("Log of event save user 1: " + employeeRepository.save(new Employee("João", "Rua Amélio", "Dev Back-End")) );
            log.info("Log of event save user 2: " + employeeRepository.save(new Employee("Maria", "Rua Silva", "Dev Front-End")) );
        };
    };
}
