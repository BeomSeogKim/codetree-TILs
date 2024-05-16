import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
        System.out.println(sb);
    }

    static void recursion(int depth) {
        if (depth == 0) return;

        for(int i = 0; i < depth; i++){
            sb.append("*").append(" ");
        }
        sb.append("\n");
        recursion(depth - 1);
        for(int i = 0; i < depth; i++){
            sb.append("*").append(" ");
        }
        sb.append("\n");
    }
}