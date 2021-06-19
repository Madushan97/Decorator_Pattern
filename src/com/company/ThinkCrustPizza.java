package com.company;

public class ThinkCrustPizza extends Pizza{

    ThinkCrustPizza(){
        this.description = "Thin Crust Pizza";
    }
    @Override
    public double getCost() {
        return 1200;
    }
}
