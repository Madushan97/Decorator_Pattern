package com.company;

public class PanPizza extends Pizza{

    PanPizza(){
        this.description = "PanPizza";
    }

    @Override
    public double getCost() {
        return 1000;
    }
}
