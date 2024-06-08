import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];
        for(int i = 0; i < 5; i++){
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextFloat());
        }
        System.out.println("name");
        Arrays.sort(persons, (p1,p2) -> p1.getName().compareTo(p2.getName()));
        for(int i = 0; i < 5; i++) {
            System.out.println(persons[i]);
        }
        System.out.println();
        System.out.println("height");
        Arrays.sort(persons, (p1,p2) -> p2.getHeight() - p1.getHeight());
        for(int i = 0; i < 5; i++) {
            System.out.println(persons[i]);
        }
    }
}

class Person {
    String name;
    int height; 
    float weight;

    Person(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    String getName() {
        return this.name;
    }

    int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.name).append(" ")
                    .append(this.height).append(" ")
                    .append(this.weight).toString();
    }
}