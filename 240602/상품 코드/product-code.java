import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =  sc.next();
        int code  = sc.nextInt();
        Product defaultProduct = new Product();
        Product inputProduct = new Product(name, code);
        System.out.println(defaultProduct);
        System.out.println(inputProduct);
    }
}

class Product{
    String name;
    int code;

    Product() {
        this.name = "codetree";
        this.code = 50;
    }

    Product(String name, int code){
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "product " + this.code + " is " + this.name;
    }
}