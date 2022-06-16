package com.company;

public class Main {

    public static void main(String[] args) {

    Circle circle = new Circle(5);
        System.out.println("radius = "+circle.getRadius());
        System.out.println("area = " +circle.getArea()) ;

    Cylinder cylinder = new Cylinder(5,10);
        System.out.println("radius = "+cylinder.getRadius());
        System.out.println("height = "+cylinder.getHeight());
        System.out.println("area = "+cylinder.getArea());
        System.out.println("volume = "+cylinder.getVolume());

    }
}
