package com.tw.shape;

public class Ball {
    private int diameter ;
    private int xCoordinate ;
    private int yCoordinate ;
    private int steps ;

    public Ball(int diameter, int xCoordinate, int yCoordinate, int steps) {
        this.diameter = diameter;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.steps = steps ;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void incrementXCoordinate(){
        xCoordinate += steps ;
    }
}
