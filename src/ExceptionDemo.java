import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please give me two numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        try
        {
            c = a / b;
            System.out.println("Division is: " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("I cannot divide by zero! Please try again.");
        }
        System.out.println("Bye");
    }
}
