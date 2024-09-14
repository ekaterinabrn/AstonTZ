package ATZ;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
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
}}
