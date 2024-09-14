package ATZ;
import java.util.Scanner;

public class TwoNumbers {
    public static void numberScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ведите число");
        int a = sc.nextInt();
        System.out.println("ведите число");
        int b = sc.nextInt();
        if(a>b){System.out.println(a  + ">" + b);}
        else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        int sum = a+b;
        System.out.println("Сумма чисел " + sum);
        int difference= a-b;
        System.out.println("Разность чисел " + difference);
        int composition = a*b;
        System.out.println("Произведение чисел " + composition);

        try{ int division = a/b; System.out.println("Деление чисел " + division);}
       catch (ArithmeticException e){ System.out.println("Деление на ноль невозможно ");
    }}}
