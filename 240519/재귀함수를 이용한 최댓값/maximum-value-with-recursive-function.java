import java.util.*;

public class Main {
    static int[] arr;
    static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        max = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        checkMax(n - 1);
        System.out.println(max);
    }

    static void checkMax(int index){
        if(index == 0){
            max = Math.max(max, arr[index]);
            return; 
        } 

        checkMax(index - 1);
        max = Math.max(max, arr[index]);
    }
}