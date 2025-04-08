import java.util.Scanner;   
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("welcome to my calculator");
        System .out.println("please enter the first number");
        int first= input.nextInt();
        System.out.println("enter the second number:");

        int second=input.nextInt();
        double add=first+second;
        double sub=first-second;
        double mul=first*second;
        double div=first/second;
        double mod=first%second;

        System.out.println("add of two numbers"+add);
        System.out.println("add of two numbers"+sub);
        System.out.println("add of two numbers"+mul);
        System.out.println("add of two numbers"+div);
        System.out.println("add of two numbers"+mod);
        



        
    }
}
