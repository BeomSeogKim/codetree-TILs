import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String place = sc.next();
        int time = sc.nextInt();
        Secret secret = new Secret(code, place, time);
        System.out.println(secret);
    }
}

class Secret {
        String code; 
        String place;
        int time;

        Secret(String code, String place, int time){
            this.code = code;
            this.place = place; 
            this.time = time;
        }

        @Override
        public String toString() {
            return "secret code : " + this.code + "\n"
            + "meeting point : " + this.place + "\n"
            + "time : " + this.time;
        }
    }