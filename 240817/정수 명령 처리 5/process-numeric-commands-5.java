import java.util.Scanner; 
import java.util.Objects; 

public class Main {

    private static int[] numbers = new int[0];
    private static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCommand = sc.nextInt();
        for(int i = 0; i < numOfCommand; i++){
            String command = sc.next();
            if (Objects.equals("size", command)) {
                System.out.println(getSize());
                continue;
            }
            if (Objects.equals("pop_back", command)){
                popBack();
                continue;
            }
            int number = sc.nextInt();
            
            if (Objects.equals("push_back", command)){
                addNumbers(number);
            }

            if (Objects.equals("get", command)) {
                System.out.println(numbers[number - 1]);
            }
            
        }
    }

    private static int getSize() {
        return numbers.length;
    }

    private static void addNumbers(int number) {
        int[] newArr = new int[getSize() + 1];
        for(int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = numbers[i];
        }
        newArr[newArr.length - 1] = number;
        numbers = newArr;
    }

    private static void popBack() {
        int[] newArr = new int[getSize() - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = numbers[i];
        }
        numbers = newArr;
    }
}