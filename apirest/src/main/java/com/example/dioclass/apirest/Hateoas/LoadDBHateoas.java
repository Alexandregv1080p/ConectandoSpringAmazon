package com.example.dioclass.apirest.Hateoas;

import com.example.dioclass.apirest.Hateoas.Entity.EmployeeHateoas;
import com.example.dioclass.apirest.Hateoas.Entity.Order;
import com.example.dioclass.apirest.Hateoas.Entity.Status;
import com.example.dioclass.apirest.Hateoas.Repository.EmployeeRepositoryHateoas;
import com.example.dioclass.apirest.Hateoas.Repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDBHateoas {

    private static final Logger log = LoggerFactory.getLogger(LoadDBHateoas.class);
    // persistindo dados no banco com jpa

    @Bean
    CommandLineRunner loaddata(EmployeeRepositoryHateoas employeeRepositoryHateoas, OrderRepository orderRepositoryHateoas) {
        return args -> {
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Maria Silva", "Chef",
                    "avenida silveira dutra 1002")));
            log.info("log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("John Dutra", "Mecanico",
                    "rua joao freire 231")));
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Bilbo Baggins", "thief",
                    "The shine")));
            orderRepositoryHateoas.save(new Order(Status.COMPLETED, "review"));
            orderRepositoryHateoas.save(new Order(Status.IN_PROGRESS, "travel"));
            orderRepositoryHateoas.save(new Order(Status.IN_PROGRESS, "sale"));
            orderRepositoryHateoas.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
