import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        Character c;
        System.out.println(" Enter number 1");
        num1 = input.nextDouble();
        System.out.println(" Enter the operation like +, -, *, /: ");
        c = input.next().charAt(0);
        System.out.println(" Enter number 2 ");
        num2 = input.nextDouble();
        System.out.println((sum(num1, c, num2)));
    }

    public static double sum(double num1, char c, double num2) {
        double result = 0;
        switch (c) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}


                



