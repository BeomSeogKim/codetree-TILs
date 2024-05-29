import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<String> strings = new ArrayList<>();
        String start = sc.next();
        
        for(int i = 0; i < n; i ++){
            String given = sc.next();
            if(given.startsWith(start)){
                strings.add(given);
            }
        }

        Collections.sort(strings);
        System.out.println(strings.get(k - 1));
    }
}