import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a = 0, b = 0;
        char op = ' ';
        try {
            a = input.nextInt();
            op = input.next().charAt(0);
            b = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers for numbers and a valid operator.");
            input.close();
            return;
        }

        switch(op)
        {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                break;
        }


    }
}
