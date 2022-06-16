package com.company;

public class Circle {

    private double radius;

    public Circle(double radius){
        if(this.radius < 0){
            this.radius = 0;
        }
        this.radius = radius;
    }

    public  double getRadius (){
        if(this.radius <  0){
            this.radius = 0;
        }
        return radius;
    }
    public double getArea (){
        return (this.radius * this.radius * Math.PI);
    }

}
