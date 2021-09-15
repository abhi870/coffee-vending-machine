package com.ideas.interview.domain.Ingredients;

public abstract class Ingredient {
    private Integer amount;

    public Ingredient(Integer amount) {
        this.amount = amount;
    }

    public abstract Boolean isAvailable(Integer amount);
}
