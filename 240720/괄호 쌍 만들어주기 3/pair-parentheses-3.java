import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int totalCount = 0;
        for(int i = 0; i < length; i++){
            char prev = str.charAt(i);
            if (prev == '('){
                for(int j = i + 1; j < length; j++){
                    if (str.charAt(j) == ')') totalCount++;
                }
            }
        }
        System.out.println(totalCount);
    }
}