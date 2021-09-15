package com.ideas.interview.domain.Entity;


import com.ideas.interview.service.ProductCreationServiceFactory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductSelection implements State {
    private CoffeeVendingMachine coffeeVendingMachine;

    @Override
    public void handle(CoffeeVendingMachine coffeeVendingMachine, Product product) {
        ProductCreationServiceFactory.createProduct(product).create();
        coffeeVendingMachine.setState(new ProductDispense(coffeeVendingMachine));
    }

}
