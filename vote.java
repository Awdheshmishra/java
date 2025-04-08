import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("welcome to driving licence: ");
        System.out.println("please enter your age: ");
        int age=input.nextInt();

        if(age>=18){
            System.out.println("you are elegible for driving: ");

        }else{
            System.out.println("beta cycle chalao avi tum :");
        }
    
    }
    
}
