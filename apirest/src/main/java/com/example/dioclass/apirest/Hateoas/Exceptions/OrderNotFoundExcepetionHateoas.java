package com.example.dioclass.apirest.Hateoas.Exceptions;

public class OrderNotFoundExcepetionHateoas extends RuntimeException{
    public OrderNotFoundExcepetionHateoas(Long id){
        super("Cold not found the employee id: "+ id);
    }
}
