package com.ideas.interview.domain.Ingredients;

public class Sugar extends Ingredient{
    public Sugar(Integer amount) {
        super(amount);
    }

    @Override
    public Boolean isAvailable(Integer amount) {
        return amount==0?false:true;
    }
}
