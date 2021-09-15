package com.ideas.interview.domain.Ingredients;

public class HotWater extends Ingredient{
    public HotWater(Integer amount) {
        super(amount);
    }

    @Override
    public Boolean isAvailable(Integer amount) {
        return amount==0?false:true;
    }
}
