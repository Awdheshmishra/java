import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("we are doing float multiplication");
        System.out.println("enterr the first number: ");
        double first=input. nextDouble();
        System.out.println("enter the second number: ");
        double second=input.nextDouble();
        double mul=first*second;
        System.out.println("the product of two number is: " +mul);
    }
    
}
