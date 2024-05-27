import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++){
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);
        System.out.println(intArr[m - 1]);
    }
}