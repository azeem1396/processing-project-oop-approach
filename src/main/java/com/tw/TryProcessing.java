package com.tw;

import com.tw.canvas.Window;
import com.tw.constant.BallConstant;
import com.tw.constant.WindowConstant;
import com.tw.shape.Ball;
import processing.core.PApplet;

public class TryProcessing extends PApplet {

    private static Window window;

    private  Ball[] balls;

    private static final int BALLS = 4;

    public static void main(String[] args) {
        window = new Window(WindowConstant.WIDTH, WindowConstant.HEIGHT);
        PApplet.main("com.tw.TryProcessing", args);
    }

    @Override
    public void setup(){
        int yCoordinate = WindowConstant.HEIGHT / 5;
        balls = new Ball[BALLS];
        for (int i = 1, speed = 1; i <= BALLS; ++i, speed++) {
            balls[i - 1] = new Ball(BallConstant.DIAMETER, 0, i * yCoordinate, speed);
        }
    }

    @Override
    public void settings() {
        size(window.getWidth(), window.getHeight());
    }

    @Override
    public void draw() {
        int yCoordinate = WindowConstant.HEIGHT / 5;
        for (int i = 0; i < BALLS; ++i) {
            ellipse(balls[i].getXCoordinate(), balls[i].getYCoordinate(), balls[i].getDiameter(), balls[i].getDiameter());
            balls[i].incrementXCoordinate();
        }
    }

}


