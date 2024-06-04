import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];
        for(int i = 0; i < n; i ++ ){
            weathers[i] = new Weather(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(weathers, (w1, w2) -> w1.date.compareTo(w2.date));
        for(int i = 0; i < n; i++){
            if (weathers[i].weather.equals("Rain")){
                System.out.println(weathers[i]);
                return;
            }
        }
    }
}

class Weather {
    String date;
    String day;
    String weather;

    Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    @Override
    public String toString() {
        return this.date + " " + this.day + " " + this.weather;
    }
}