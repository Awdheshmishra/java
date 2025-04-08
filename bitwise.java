import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first number: ");
        int first=input.nextInt();
        System.out.println("please enter the other number: ");
        int second=input.nextInt();

        // int result=first&second;

        // int result=first|second;

        int result=first^second;
        System.out.println("result is: "+result);
    }
}
