package java_assignment_1;
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

         int numDay = sc.nextInt();
         TryingMethods c = new TryingMethods();
         System.out.println(c.dayOfTheWeek(numDay));

     }

     public String dayOfTheWeek(int numDay) {
         switch (numDay) {
             case 1:
                 return "The day is: Monday";
             case 2:
                 return "The day is: Tuesday";
             case 3:
                 return "The day is: Wednesday";
             case 4:
                 return "The day is: Thursday";
             case 5:
                 return "The day is: Friday";
             case 6:
                 return "The day is: Saturday";
             case 7:
                 return "The day is: Sunday";
             default:
                 return "Not a day in time!";
         }

     }

     public void gradeLevel(int level) {
        if (level < 40) {
            System.out.println("You are on earth");
        }
        else if(level < 70) {
            System.out.println("You are in the moon!");
        }
        else {
            System.out.println("You are over the moon!!");
        }
     }
}
