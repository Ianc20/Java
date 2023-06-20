package corejava6;

public class Ferrari extends Car{
    public Ferrari() {
        super();
    }
    public Ferrari(String type) {
        super(type);
    }
    /* public Ferrari(String color, double topSpeed, String type, boolean convertible) {
        super(color, topSpeed, type, convertible);
    } */
   

    @Override
    public void features() {
        System.out.println("Ferrari type is:" + this.type);
    }
    public String features(String color) {
        this.color = color;
        System.out.println("Ferrari color is:" + this.color);
        return this.color;
    }
   
    public double features(double topSpeed) {
        this.topSpeed = topSpeed;
        System.out.println("Ferrari top speed is:" + this.topSpeed);
        return this.topSpeed;
    }
    
    public boolean features(boolean convertible) {
        this.convertible = convertible;
        System.out.println("Ferrari convertible is:" + this.convertible);
        return this.convertible;
    }


    
    
}
