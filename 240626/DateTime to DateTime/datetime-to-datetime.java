import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 일
        int a = sc.nextInt();
        // 시 
        int b = sc.nextInt();
        // 분
        int c = sc.nextInt();
        

        if (a < 11) {
            System.out.println("-1");
            return;
        }
        if (a == 11 && b < 11) {
            System.out.println("-1");
            return;
        }

        if (a == 11 && b == 11 && c < 11) {
            System.out.println("-1");
            return;
        }

        int elapsedTime = 0;
        
        elapsedTime += (a - 11) * 24 * 60;
        elapsedTime += (b - 11) * 60;
        elapsedTime += (c - 11);
        System.out.println(elapsedTime);
    }
}