package Prac20;
import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(750, 1000);
        setVisible(true);
        String color;
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        String color;
        int x=50;
        int y=50;
        int width=50;
        int height=50;
        int arcWidth=20;
        int arcHeight=20;
        String shape;
        for(int i=0;i<20;i++) {
            switch ((int) (Math.random()*10 % 5)) {
                case 0:
                    color = "RED";
                    g2d.setColor(Color.RED);
                    break;
                case 1:
                    color = "GREEN";
                    g2d.setColor(Color.GREEN);
                    break;
                case 2:
                    color = "BLUE";
                    g2d.setColor(Color.BLUE);
                    break;
                case 4:
                    color = "PINK";
                    g2d.setColor(Color.PINK);
                    break;
                default:
                    color = "RED";
                    g2d.setColor(Color.RED);
                    break;
            }
            if(i%2==0){
                x=100;
            }else{
                x=20;
                y=y+55;
            }
            switch ((int) (Math.random() *10 % 4)) {
                case 0:
                    Shape circle =new Circle(color,x,y,width,height);
                    g2d.drawOval(x, y, width, height);
                    break;
                case 1:
                    Shape rect = new Rect(color,x,y,width,height);
                    g2d.drawRect(x,y,width,height);
                    break;
                case 2:
                    Shape RoundRect = new RoRe(color,x, y, width, height, arcWidth, arcHeight);
                    g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
                    break;
                case 3:
                    Shape RoRe1=new RoRe(color,x, y, width, height, arcWidth, arcHeight);
                    g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
                    Shape rect1 = new Rect(color,x, y, 25, 25);
                    Shape rect2 = new Rect(color,x + 25, y, 25, 25);
                    Shape rect3 = new Rect(color,x, y + 25, 25, 25);
                    Shape circle1 =new Circle(color,x, y, 25, 25);
                    g2d.drawRect(x,y,25,25);
                    g2d.drawRect(x+25,y,25,25);
                    g2d.drawRect(x,y+25,25,25);
                    break;
            }

        }
    }
}




