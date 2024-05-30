import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int cur = sc.nextInt();
            list.add(cur);
            
            if(i % 2 != 0){
                Collections.sort(list);
                System.out.print(list.get(i / 2) + " ");
            }
        }
    }
}