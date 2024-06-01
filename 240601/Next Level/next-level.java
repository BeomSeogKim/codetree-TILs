import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        User defaultUser = new User();
        User inputUser = new User(id, level);
        System.out.println(defaultUser);
        System.out.println(inputUser);
    }
}

class User {
    String id;
    int level; 

    public User() {
        this.id = "codetree";
        this.level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "user " + this.id + " lv " + this.level;
    }
}