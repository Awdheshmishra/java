import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n");
        int n = input.nextInt();
        int sum = 0;

        int mul=1; 

        while (n > 0) {
            int digit = n % 10; 
            sum += digit; 
            
            mul*=digit;     
            n /= 10;           
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("product of digits: "+mul);
    }
    
}
