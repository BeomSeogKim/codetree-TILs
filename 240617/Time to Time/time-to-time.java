import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int elapsedTime = 0;
        while (a != c || b != d) {
            elapsedTime++;
            b++;
            if (b == 60) {
                b = 0; 
                a++;
            }
        }

        System.out.println(elapsedTime);
    }
}