import java.util.Scanner;

public class compoundintrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcomme to my compound inntrest calculator: let's start");
        System.out.println("please enter the principal amount of your amount RS: ");
        int principal=input.nextInt();
        
        System.out.println("now, tell me rate of your intrest: ");
        float rate=input.nextFloat();
        System.out.println("now tell me for how many year you borrowed? ");
        float years=input.nextFloat();

        double compoundintrest=principal*Math.pow((1+rate/100),years);
        System.out.println("the compound intrest is: "+compoundintrest);

    }
}
