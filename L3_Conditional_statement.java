import java.beans.Expression;
import java.util.Scanner;
public class L3_Conditional_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int day = sc.nextInt();
        switch (day)
        {
           case  1:
               System.out.print("Monday");
               break;
           case 2:
               System.out.print("Tuesday");
               break;
           case 3:
               System.out.print("Wednessday");
               break;
           case 4:
               System.out.println("Thrusday");
           case 5:
               System.out.println("Friday");
           case 6:
               System.out.println("Saturday");
           case 7:
               System.out.println("Sunday");
           default:
               System.out.print("Invalid");
       }

    }
}
