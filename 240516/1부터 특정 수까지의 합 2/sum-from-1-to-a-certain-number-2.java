import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFunction(n));
    }

    static int sumFunction(int x){
        if (x == 1){
            return 1;
        }
        return sumFunction(x - 1) + x;
    }
}