import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(calculateCount(number));
    }
    
    static int calculateCount(int number){
        if (number == 1){
            return 0;
        }
        return number % 2 == 0 ? calculateCount(number / 2) + 1 : calculateCount(number / 3) + 1;
    }
}