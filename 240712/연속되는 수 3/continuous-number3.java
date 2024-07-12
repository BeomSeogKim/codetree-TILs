import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNum = sc.nextInt();
        boolean isPositive = firstNum < 0 ? false : true;
        int count = 1;
        int maxCount = 0;
        for(int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            if((num < 0 && !isPositive) || (num > 0 && isPositive)){
                count++;
            } else if( num < 0){
                count = 1;
                isPositive = false;
            } else {
                count = 1;
                isPositive = true;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount);
    }
}