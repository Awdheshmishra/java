import java.util.Scanner;

public class fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to tempreature converter: ");
        System.out.println("enter your tempreature in fahrenheit: ");
        float fah= input.nextFloat();

        float celsius=(fah-32)*5/9;
        System.out.println("your tempreature is "+celsius+"C");
    }
}
