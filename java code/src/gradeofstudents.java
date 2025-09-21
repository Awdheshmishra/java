import java.util.Scanner;

public class gradeofstudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks: ");
        int n = sc.nextInt();

        if(n>80) System.out.println(" very good");
        else if (n>60) System.out.println("good ");
        else if(n>40) System.out.println("average");
        else System.out.println("fail");
    }
}
