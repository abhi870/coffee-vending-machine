package com.ideas.interview.domain.Ingredients;

public class Milk extends Ingredient{
    public Milk(Integer amount) {
        super(amount);
    }

    @Override
    public Boolean isAvailable(Integer amount) {
        return amount==0?false:true;
    }
}
