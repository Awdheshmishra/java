import java.util.Scanner; 
 
 public class swapping {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("welcome to swappinng");
        System.out.println("enter the value of A:");
        int a=input.nextInt();
        System.out.println("enter the value of B:");
        int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("swapping done:");
        System.out.println("vlaue of b is"+a);
        System.out.println("vlaue of b is"+b);
    }
    
}
