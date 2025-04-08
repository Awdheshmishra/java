import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("welcome to leap year calculator: ");
        System.out.println("please enter the year");
        int year=input.nextInt();

        if((year%400==0)||(year%4==0 && year%100 !=0)){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
