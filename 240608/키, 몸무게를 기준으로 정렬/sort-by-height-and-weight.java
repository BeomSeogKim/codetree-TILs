import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * 키를 기준으로 오름차순 
     * 키가 동일한 경우 몸무게가 큰 사람이 나오도록
     */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for(int i = 0; i < n; i++) {
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(persons);

        for(int i = 0; i < n; i++) {
            System.out.println(persons[i]);
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int height; 
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        if (this.height != person.height) {
            return this.height - person.height;
        }
        return person.weight - this.weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.name).append(" ")
                    .append(this.height).append(" ")
                    .append(this.weight).toString();
    }

}