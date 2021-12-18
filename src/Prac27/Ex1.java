package Prac27;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex1 {
    public Ex1(){
        System.out.println("Введите строку");
        Scanner MyScanner = new Scanner(System.in);
        String str = MyScanner.nextLine();
        while (!(str.equals("-1"))) {

            System.out.println("Вводите регулярные выражения");
            String reg;
            reg=MyScanner.nextLine();
            while(!(reg.equals("-1"))){
                Pattern pattern=Pattern.compile(reg);// возвращает Pattern, который соответствует regex
                Matcher matcher=pattern.matcher(str);//matches() – проверяет, соответствует ли вся строка шаблону;
                while (matcher.find()) {
                    System.out.println(str.substring(matcher.start(), matcher.end()));
                }
                reg=MyScanner.nextLine();
            }
            System.out.println("Введите строку");
            str=MyScanner.nextLine();

        }
    }
}
