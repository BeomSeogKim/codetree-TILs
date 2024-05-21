import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }

    static int recursion(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return recursion(n / 3) + recursion(n - 1);
    }
}