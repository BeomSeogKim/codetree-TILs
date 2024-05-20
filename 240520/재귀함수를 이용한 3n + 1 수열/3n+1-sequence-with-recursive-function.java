import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }

    static int recursion(int number){
        if (number == 1){
            return 0;
        }
        return number % 2 == 0 ? recursion(number / 2) + 1 : recursion(number * 3 + 1) + 1;
    }

}