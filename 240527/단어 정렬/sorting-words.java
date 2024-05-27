import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        String[] stringArray = new String[n];
        for(int i = 0; i < n; i++){
            stringArray[i] = sc.next();
        }
        Arrays.sort(stringArray);
        for(int i = 0; i < n; i++){
            sb.append(stringArray[i]).append("\n");
        }
        System.out.println(sb);
    }
}