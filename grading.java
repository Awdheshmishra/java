import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to grade calculator");
        System.out.println("please enter your percentage: ");
        float percentage=input.nextFloat();

        if (percentage>=90) {
            System.out.println("you got grade A");
            
        }else if (percentage>=75) {
            System.out.println("you got grade B");
            
        }else if (percentage>=50) {
            System.out.println("you got grade C");
            
        }else{
            System.out.println("you are failed in your examination please tru again!");
        }


    }
}
