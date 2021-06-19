package com.company;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new ThinkCrustPizza();
        Pizza bbqChickenPizza = new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese = new ExtraCheese(bbqChickenPizza);

        System.out.println("Cost of BBQ chicken with extra cheese" + bbqChickenWithExtraCheese.getCost());

        Pizza pizza1 = new PanPizza();

        Pizza thandooriChickenPizza = new ThandooriChicken(pizza1);

        double cost = pizza.getCost();

        System.out.println(pizza.description + " : " + cost);

        //Pizza -> thin crust pizza -> BBQ chicken -> extra cheese  => ThinCrustBBQExtra.java
        //Pizza -> pan Pizza  -> Tandoori chicken => PanPizzaMuttonTandooriChicken.java

        //decorator pattern for this problem
    }
}
