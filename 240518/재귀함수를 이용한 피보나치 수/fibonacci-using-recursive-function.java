import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int index){
        if (index == 1) {
            return 1;
        }
        if (index == 2){
            return 1;
        }
        return fibonacci(index - 2) + fibonacci(index - 1);
    }
}