import java.util.Scanner;

public class addtwonumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("weelcome to kg caculator");

        System.out.println("please enter first number");
        int firstnum=input.nextInt();
        System.out.println("please enter the second number");
        int secondnum=input.nextInt();
        int sum=firstnum+secondnum;
        System.out.print(sum);


    }

    
}
