package ATZ;
import java.util.Scanner;
public class TwoStrings {
    public static void stringScaner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите слово или строку");
        String a = scanner.nextLine();
        System.out.println("ведите слово или строку");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }}

