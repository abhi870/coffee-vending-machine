package com.ideas.interview.domain.Entity;

import com.ideas.interview.service.ProductCreationServiceFactory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ProductDispense implements State {
    private CoffeeVendingMachine coffeeVendingMachine;

    @Override
    public void handle(CoffeeVendingMachine coffeeVendingMachine, Product product) {
        log.info("product dispensing...");
    }
}
