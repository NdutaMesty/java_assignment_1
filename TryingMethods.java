package java_assignment_1;

import java.time.DayOfWeek;
import java.util.Scanner;

public class TryingMethods {
    /*
     * Add comments to describe what this class does
     * Add the main method to this class
     * Add at least four methods in this class
     * Two of the method should be dynamic and the other two static
     */

     public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);
         System.out.println("Select a number between 1-7: ");

         int numDay;
         numDay = sc.nextInt();
         switch (numDay) {
             case 1:
                 System.out.println("The day is: Monday");
                 break;
             case 2:
                 System.out.println("The day is: Tuesday");
                 break;
             case 3:
                 System.out.println("The day is: Wednesday");
                 break;
             case 4:
                 System.out.println("The day is: Thursday");
                 break;
             case 5:
                 System.out.println("The day is: Friday");
                 break;
             case 6:
                 System.out.println("The day is: Saturday");
                 break;
             case 7:
                 System.out.println("The day is: Sunday");
                 break;
             default:
                 System.out.println("Not a day in time!");
                 break;
         }
     }
}
