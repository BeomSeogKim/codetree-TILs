import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] cows = new int[count];
        for(int i = 0; i < count; i++){
            cows[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){
                for(int k = j + 1; k < count; k++){
                    if (cows[i] <= cows[j] && cows[j] <= cows[k]){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}