import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("wwelcome to multiplication table: ");
        System.out.println("please enter the number: ");
        int num=input.nextInt();
        printmultiplicationtable(  num);

    }
public static void printmultiplicationtable(int num)
{
    int i= 1;
    while(i<10)
    {
        System.out.println(num + "x" + i + "=" + (num * i));
        i++;
    }
}
}
