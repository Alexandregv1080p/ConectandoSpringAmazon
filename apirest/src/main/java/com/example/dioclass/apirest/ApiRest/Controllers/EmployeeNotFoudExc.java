package com.example.dioclass.apirest.ApiRest.Controllers;

public class EmployeeNotFoudExc extends RuntimeException{
    public EmployeeNotFoudExc(Long id){
        super("Could not find the id: " + id);
    }

}
