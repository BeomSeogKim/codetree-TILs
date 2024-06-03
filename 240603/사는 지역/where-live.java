import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++){
            persons[i] = new Person(sc.next(), sc.next(), sc.next());
        }
        Arrays.sort(persons, (p1, p2) -> p2.name.compareTo(p1.name));

        System.out.println("name " + persons[0].name);
        System.out.println("addr " + persons[0].address);
        System.out.println("city " + persons[0].city);
    }
}

class Person { 
    String name; 
    String address;
    String city;

    Person(String name, String address, String city){
        this.name = name;
        this.address = address;
        this.city = city;
    }
}