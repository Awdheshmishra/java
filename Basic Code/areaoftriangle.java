import java.util.Scanner;

public class areaoftriangle {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our calculator which solve area of triangle :");
        System.out.println("enter the base: ");
        float base= input.nextFloat();
        System.out.println("enter the height: ");
        float height=input.nextFloat();

        
        double area=0.5*base*height;
        System.out.println("the are of the trinagle is:"+area);

    }
}
