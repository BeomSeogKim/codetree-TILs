import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String as = sc.next();
        char[] charArray = new char[as.length()];
        for(int i = 0; i < as.length(); i++){
            charArray[i] = as.charAt(i);
        }
        Arrays.sort(charArray);
        String to = new String(charArray);
        System.out.println(to);
    }
}