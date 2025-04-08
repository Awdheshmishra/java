import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to even odd calculator: ");
        System.out.println("please enter the number you want to check: ");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("this number is EVEN ");
        }else{
            System.out.println("this number is ODD");
        }
    }
}
