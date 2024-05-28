import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        
        for(int i = 0; i < n; i++){
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr);

        int max = 0; 
        for (int i = 0; i < (n / 2); i++){
            int sum = intArr[i] + intArr[n - 1 - i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}