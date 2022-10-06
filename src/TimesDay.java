import java.util.Scanner;

public class TimesDay {
    public static void main(String[] args) {
        /*The time is entered from the keyboard (the number of hours
from 0 to 24), and the program displays greeting corresponding
to the entered time (for example, if 15 is entered, the greeting
“good day” is displayed).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = sc.nextInt();
        if(0<=time && time<6){
            System.out.println("Good night");
        }
        if (6<=time && time<12) {
            System.out.println("Good morning");

        }
        if (12<=time && time<18) {
            System.out.println("Good day");
        }
        else{
            System.out.println("Good evening");}






        }
    }
