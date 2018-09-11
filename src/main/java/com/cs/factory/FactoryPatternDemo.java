package com.cs.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

    }
}
