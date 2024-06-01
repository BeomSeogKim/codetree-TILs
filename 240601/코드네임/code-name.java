import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++){
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }

        Arrays.sort(agents, (a1, a2) -> a1.getScore() - a2.getScore());
        System.out.println(agents[0]);
    }
}

class Agent {
    String name;
    int score;

    Agent(String name, int score){
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString(){
        return this.name + " " + this.score;
    }
}