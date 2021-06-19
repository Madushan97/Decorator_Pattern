package com.company;

public class ExtraCheese extends PizzaDecorator {

    ExtraCheese(Pizza p){
        super.pizza = p;
    }
    public double getCost(){
        return pizza.getCost() + 400;
    }
}
