import java.util.Scanner;

public class Main {
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        // 출력
        System.out.println(numOfDays(m2, d2) - numOfDays(m1, d1) + 1);
    }
}