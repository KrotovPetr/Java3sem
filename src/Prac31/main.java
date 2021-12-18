package Prac31;

import javax.swing.*;

import Prac14.*;

public class main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        OrderManager orders = new OrderManager();

        JFrameClass j = new JFrameClass(orders);
    }
}
