package com.ideas.interview.domain.Entity;

public class Controller {
    public static void main(String[] args) {
        CoffeeVendingMachine coffeeVendingMachine = launchMachine();
    }

    private static CoffeeVendingMachine launchMachine(){
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachine();
        coffeeVendingMachine.setCoffeePowder(10)
                .setCoffeePowder(10)
                .setHotWater(10)
                .setMilk(10);
        coffeeVendingMachine.setState(new ProductSelection());
        return coffeeVendingMachine;
    }
}
