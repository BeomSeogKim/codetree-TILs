import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
        System.out.println(sb);
    }

    static void recursion(int depth){
        if (depth == 0) return; 
        sb.append(depth).append(" ");
        recursion(depth - 1);
        sb.append(depth).append(" ");
    }
}