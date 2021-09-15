package com.ideas.interview.domain.Ingredients;

public class CoffeePowder extends Ingredient{
    public CoffeePowder(Integer amount) {
        super(amount);
    }

    @Override
    public Boolean isAvailable(Integer amount) {
        return amount==0?false:true;
    }
}
