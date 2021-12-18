package Prac24;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Exception3 c =new Exception3();
        c.getKey();

        Exception1 a =new Exception1();
        a.exceptionDemo();
        String intString=null;
        try{
         Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        intString = myScanner.next();

        }
        catch(RuntimeException e){

        a.printMessage(intString);
        Exception2 b = new Exception2();
    }

}
}