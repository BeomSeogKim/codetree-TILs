import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        int number = arr[0] * arr[1] * arr[2];

        System.out.println(calculate(number));
    }

    static int calculate(int number){
        if (number < 10){
            return number;
        }
        return calculate(number / 10) + number % 10;
    }
}