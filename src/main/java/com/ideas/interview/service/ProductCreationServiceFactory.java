package com.ideas.interview.service;

import com.ideas.interview.domain.Entity.Product;

public class ProductCreationServiceFactory {
    public static CreaterService createProduct(Product product){
        if(product.toString().equals(Product.BLACK_COFFEE.toString()))
            return new BlackCoffeeCreaterService();
        else if(product.toString().equals(Product.LATTE.toString()))
            return new LatteCreaterService();
        else
            return null;
    }
}
