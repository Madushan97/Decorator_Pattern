package com.company;

public class BBQChicken extends PizzaDecorator {

    BBQChicken(Pizza p){
        super.pizza = p;
    }
    public double getCost(){
        return pizza.getCost() + 400;
    }
}
