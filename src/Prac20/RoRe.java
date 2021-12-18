package Prac20;
import java.awt.*;

public class RoRe extends Shape{

    public RoRe(String color, int x,int y,int width,int height,int arcWidth,int arcHeight){
        super(color,x,y,width,height,arcWidth,arcHeight);
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
