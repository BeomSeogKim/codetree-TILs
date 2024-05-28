import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.length() != str2.length()){
            System.out.println("No");
            return;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean flag = true;
        for(int i = 0; i < str1.length(); i++) {
            if (chars1[i] != chars2[i]){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}