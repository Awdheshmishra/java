import java.util.Scanner;

class age {
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        System.out.println("please enter the age for checking: ");
        int age=input.nextInt();
        if (age<=13) {
            System.out.println("you are a child");
            
        }else if (age<=20) {
            System.out.println("you are a teen");
            
        }else if (age<=60) {
          System.out.println("you are adult");  
        }else{
            System.out.println("you are a senior citizen");
        }
    }
}
// The time complexity of your code is O(1). 
// This is because the code performs a constant number of operations regardless of the input size.
