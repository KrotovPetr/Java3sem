package Prac20;

import java.awt.*;

public class Rect extends Shape{

    public Rect(String color, int x,int y,int width,int height){
        super(color,x,y,width,height);


    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void print() {
        System.out.println("color "+color+"\nX:"+x+"\nY:"+y);
    }


}
