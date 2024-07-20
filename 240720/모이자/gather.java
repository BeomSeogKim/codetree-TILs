import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(decideBestDistance(A));
    }

    public static int decideBestDistance(int[] A){
        int bestDistance = Integer.MAX_VALUE;
        int total = A.length;

        for(int i = 0; i < total; i++){
            int sum = 0;
            for(int j = 0; j < total; j++){
                sum += Math.abs(i - j) * A[j];
            }
            bestDistance = Math.min(bestDistance, sum);
        }
        return bestDistance;
    }
}