import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("please enter your age: ");
        int age=input.nextInt();
        System.out.println("are you a female? (true/false) ");
        boolean isfeamle=input.nextBoolean();
    
        if(age<5){
            System.out.println("you got 75% discount: ");

        }else if(isfeamle){
            System.out.println("you got 50% discount: ");
        }else if (age>60 && ! isfeamle) {
            System.out.println("you got 25% discount: ");
            
        }else{
            System.out.println("sorry, you got not any discount:");
        }

        
    }
}
