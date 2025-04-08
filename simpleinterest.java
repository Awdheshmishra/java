import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("wwelcome to simple intrest calculator: ");
        System.out.println("please enter for principle amount R.S: ");
        int principle=input.nextInt();

        System.out.println("enter the rate of your intrest: ");
        float rate= input.nextFloat();

        System.out.println("now tell me for how many year you borrow: ");
        float year=input.nextFloat();

        float intrest=(principle*rate*year)/2;
        System.out.println("the amount of your intrest is: "+intrest);
    }
}
