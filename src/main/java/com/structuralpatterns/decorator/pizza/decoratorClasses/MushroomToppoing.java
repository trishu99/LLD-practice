package main.java.com.structuralpatterns.decorator.pizza.decoratorClasses;

import main.java.com.structuralpatterns.decorator.pizza.baseClasses.BasePizza;

public class MushroomToppoing implements Topping{
    BasePizza pizza;

    public MushroomToppoing(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 20;
    }
}
