import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println(powerEachNumber(number));
    }

    static int powerEachNumber(int number){
        if (number < 10) {
            return number * number;
        }
        int res = number % 10;
        return powerEachNumber(number / 10) + (res * res);
    }
}