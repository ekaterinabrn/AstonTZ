package ATZ;

public class ArrNumber {
    private static final  int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static  void getEvenNumbers(){
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
