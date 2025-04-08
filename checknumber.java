import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your number: ");
        int num=input.nextInt();
        if(num>0){
            System.out.println("this number is positive");
        }else if(num==0){
            System.out.println("this number is zero: ");
        }else{
            System.out.println("this number is negative: ");
        }
    }
    
}
