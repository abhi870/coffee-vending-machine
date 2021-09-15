package com.ideas.interview.domain.Entity;

import com.ideas.interview.domain.Ingredients.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeVendingMachine {
    private State state;
    private Map<Ingredients, Ingredient> ingredientMap;





    public CoffeeVendingMachine setSugar(Integer amount){
        this.ingredientMap.put(Ingredients.SUGAR, new Sugar(amount));
        return this;
    }

    public CoffeeVendingMachine setHotWater(Integer amount){
        this.ingredientMap.put(Ingredients.HOTWATER, new HotWater(amount));
        return this;
    }
    public CoffeeVendingMachine setCoffeePowder(Integer amount){
        this.ingredientMap.put(Ingredients.COFFEE_POWDER, new CoffeePowder(amount));
        return this;
    }
    public CoffeeVendingMachine setMilk(Integer amount){
        this.ingredientMap.put(Ingredients.MILK, new Milk(amount));
        return this;
    }

   public void setState(State state){
        this.state = state;
   }
}
