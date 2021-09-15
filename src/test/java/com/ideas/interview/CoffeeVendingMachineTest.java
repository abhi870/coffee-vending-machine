package com.ideas.interview;

import com.ideas.interview.domain.Entity.CoffeeVendingMachine;
import com.ideas.interview.domain.Entity.Product;
import com.ideas.interview.domain.Entity.ProductSelection;
import com.ideas.interview.service.ProductCreationServiceFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CoffeeVendingMachineTest {

    private CoffeeVendingMachine coffeeVendingMachine;

    @BeforeEach
    public void setUp() {
        coffeeVendingMachine = new CoffeeVendingMachine();
        coffeeVendingMachine.setState(new ProductSelection(coffeeVendingMachine));
        coffeeVendingMachine.setIngredientMap(new HashMap<>());
        coffeeVendingMachine.setCoffeePowder(10)
                .setCoffeePowder(10)
                .setHotWater(10)
                .setMilk(10);
    }

    @Test
    public void shouldDispenseLatte() {
        for (int i = 0; i < 2; i++)
            coffeeVendingMachine.getState().handle(coffeeVendingMachine, Product.LATTE);

    }
}
