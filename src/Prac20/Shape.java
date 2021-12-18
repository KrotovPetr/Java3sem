package Prac20;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JFrame {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected String color;
    protected int arcWidth;
    protected int arcHeight;
    public Shape(String color, int x, int y,int width,int height)
    {

        this.x=x;
        this.y=y;
        this.color=color;
        this.width=width;
        this.height=height;

    }
    public Shape(String color, int x, int y,int width,int height,int arcWidth,int arcHeight)
    {

        this.x=x;
        this.y=y;
        this.color=color;
        this.width=width;
        this.height=height;
        this.arcHeight=arcHeight;
        this.arcWidth=arcWidth;

    }
    public abstract int getX();
    public abstract int getY();
    public abstract void print();
}


