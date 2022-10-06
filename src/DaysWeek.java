import java.util.Scanner;

public class DaysWeek {
    public static void main(String[] args) {
        /*Write a program that prompts the user to enter the number of
the day of the week from the keyboard and displays the name of
that day in response (for example, 6 stands for Saturday). Solve
using switch.*/
        Scanner sc =new  Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        int n = sc.nextInt();
        sc.close();

        switch (n) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");




        }
    }
}
