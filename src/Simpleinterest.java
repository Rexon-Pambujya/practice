import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        float principle = in.nextFloat();
        System.out.println("Enter time: ");
        float time = in.nextFloat();
        System.out.println("Enter rate: ");
        float rate = in.nextFloat();
        float si = (principle * time * rate)/100 ;
        System.out.println("The simple interest is: "+si);
    }
}
