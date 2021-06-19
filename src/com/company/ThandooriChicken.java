package com.company;

public class ThandooriChicken extends PizzaDecorator {

    ThandooriChicken(Pizza p){
        super.pizza = p;
    }
    public double getCost(){
        return pizza.getCost() + 400;
    }
}
