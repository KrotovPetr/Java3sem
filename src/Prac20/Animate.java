package Prac20;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;



class LabExample3 extends JFrame {
    BufferedImage myPicture = null;


    public void paint(Graphics g){

        for(int i =0;i<148;i++){
            try {
                if(i%2==0)
                    myPicture = ImageIO.read(new File("C:\\Users\\Администратор\\Desktop\\3.jpg"));

                else
                    myPicture = ImageIO.read(new File("C:\\Users\\Администратор\\Desktop\\4.jpg"));
            } catch (IOException e) {
            }
            g.drawImage(myPicture,0,0,400,400,null);
            setSize(400,400);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    LabExample3() {
        super("Example");
        setVisible(true);
    }


}


public class Animate {
    Animate(){
        LabExample3 f = new LabExample3();
    }
}
