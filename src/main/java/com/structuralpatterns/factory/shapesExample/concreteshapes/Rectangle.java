package main.java.com.structuralpatterns.factory.shapesExample.concreteshapes;

import main.java.com.structuralpatterns.factory.shapesExample.interfaces.Shape;

public class Rectangle implements Shape {
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
