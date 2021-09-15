package com.ideas.interview.domain.Entity;

public interface State {
    void handle(CoffeeVendingMachine coffeeVendingMachine, Product product);
}
