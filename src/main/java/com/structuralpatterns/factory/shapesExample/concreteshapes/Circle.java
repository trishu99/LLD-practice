package main.java.com.structuralpatterns.factory.shapesExample.concreteshapes;

import main.java.com.structuralpatterns.factory.shapesExample.interfaces.Shape;

public class Circle implements Shape {
    public void draw(){
        System.out.println("drawing circle");
    }
}
