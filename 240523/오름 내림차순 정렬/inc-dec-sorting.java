import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.print(nums[n - i - 1] + " ");
        }
    }
}