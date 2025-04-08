import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to perimeter calculator: let's start");
        System.out.println("enter the four sides: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();

         double perimeter=a+b+c+d;
        System.out.println("the perimeter of rectangle is: "+perimeter);
    }
}
