import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int maxCnt = 1;
        int prev = sc.nextInt();
        for(int i = 0; i < n - 1; i++){
            int now = sc.nextInt();
            if (prev == now) {
                cnt++;
            } else {
                prev = now;
                cnt = 1;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.println(maxCnt);
    }
}