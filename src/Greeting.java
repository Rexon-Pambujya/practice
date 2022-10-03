import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter your name to see the magic: ");
        String name = in.next();
        System.out.println(" You are best " +name);
    }
}
