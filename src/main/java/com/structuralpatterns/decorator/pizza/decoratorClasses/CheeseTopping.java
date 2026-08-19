package main.java.com.structuralpatterns.decorator.pizza.decoratorClasses;

import main.java.com.structuralpatterns.decorator.pizza.baseClasses.BasePizza;

public class CheeseTopping implements Topping {
    BasePizza pizza;
    public CheeseTopping(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 10;
    }

}
