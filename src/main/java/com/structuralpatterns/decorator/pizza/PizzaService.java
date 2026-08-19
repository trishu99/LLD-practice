package main.java.com.structuralpatterns.decorator.pizza;

import main.java.com.structuralpatterns.decorator.pizza.baseClasses.BasePizza;
import main.java.com.structuralpatterns.decorator.pizza.baseClasses.Margarita;
import main.java.com.structuralpatterns.decorator.pizza.decoratorClasses.CheeseTopping;
import main.java.com.structuralpatterns.decorator.pizza.decoratorClasses.MushroomToppoing;

public class PizzaService {
    public void run(){
        BasePizza pizza = new Margarita();
        BasePizza cheesePizza = new CheeseTopping(pizza);
        BasePizza mushroomPizza = new MushroomToppoing(cheesePizza);

        System.out.println(mushroomPizza.cost());
    }
}
