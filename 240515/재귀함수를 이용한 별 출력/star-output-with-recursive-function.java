import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printStar(n);
        System.out.println(sb);
    }

    static void printStar(int depth){
        if (depth == 0) {
            return; 
        }
        printStar(depth - 1);
        for(int i = 0; i < depth; i++){
            sb.append("*");
        }
        sb.append("\n");
    }
}