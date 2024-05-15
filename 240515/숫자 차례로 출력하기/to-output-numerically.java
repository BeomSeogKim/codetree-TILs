import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
        sb.append("\n");
        recursiveReverse(n);

        System.out.println(sb);
    }

    private static void recursive(int depth){
        if(depth == 0){
            return;
        }
        recursive(depth - 1);
        sb.append(depth).append(" ");
    }

    private static void recursiveReverse(int depth){
        if(depth == 0){
            return;
        }
        sb.append(depth).append(" ");
        recursiveReverse(depth - 1);
    }
}