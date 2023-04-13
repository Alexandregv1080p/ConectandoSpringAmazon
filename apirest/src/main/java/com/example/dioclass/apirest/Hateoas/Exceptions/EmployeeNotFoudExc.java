package com.example.dioclass.apirest.Hateoas.Exceptions;

public class EmployeeNotFoudExc extends RuntimeException{
    public EmployeeNotFoudExc(Long id){
        super("Could not find the id: " + id);
    }

}
