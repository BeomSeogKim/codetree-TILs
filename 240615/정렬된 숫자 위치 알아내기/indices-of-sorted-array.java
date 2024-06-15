import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n];
        Number[] numbers = new Number[n];
        for(int i = 0; i < n; i++){
            numbers[i] = new Number(sc.nextInt(), i + 1);
        }
        Arrays.sort(numbers);
        for(int i = 0; i < n; i++) {
            answer[numbers[i].index - 1] = i + 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

class Number implements Comparable<Number> {
    int value;
    int index;

    Number(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Number number) {
        if (this.value == number.value) {
            return 1;
        }
        return this.value - number.value;
    }
}