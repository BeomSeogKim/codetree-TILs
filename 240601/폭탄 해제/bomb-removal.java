import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bomb bomb = new Bomb(sc.next(), sc.next(), sc.nextInt());
        System.out.println(bomb);
    }
}

class Bomb {
    String code;
    String color;
    int second;

    Bomb(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }

    @Override
    public String toString() {
        return "code : " + this.code + "\n" 
        + "color : " + this.color + "\n"
        + "second : " + this.second;
    }
}