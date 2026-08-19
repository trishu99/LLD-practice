package main.java.com.structuralpatterns.factory.shapesExample;

import main.java.com.structuralpatterns.factory.shapesExample.concreteshapes.Circle;
import main.java.com.structuralpatterns.factory.shapesExample.concreteshapes.Rectangle;
import main.java.com.structuralpatterns.factory.shapesExample.concreteshapes.Square;
import main.java.com.structuralpatterns.factory.shapesExample.interfaces.Shape;

public class ShapeFactory {
    public Shape getShape(String input){
        if(input.equals("Circle")){
            return new Circle();
        }
        else if(input.equals("Rectangle")){
            return new Rectangle();
        }
        else if(input.equals("Square")){
            return new Square();
        }
        return new Circle();
    }

}
