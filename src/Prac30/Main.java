package Prac30;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Введите пароль\n");
        String str= myScanner.next();
        Checker a = new Checker(str);
    }
}
