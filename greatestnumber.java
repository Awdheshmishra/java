import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number: ");
        double first=input.nextDouble();
        System.out.println("enter the second number: ");
        double second=input.nextDouble();
        System.out.println("enter the third number: ");
        double third=input.nextDouble();

        if(first>=second && first>=third){
            System.out.println("first is greatest number");
        }else if(second>=third){
            System.out.println("second is gratest");
        }else{
            System.out.println("third is gretest");
        }
    }

    

    
}
