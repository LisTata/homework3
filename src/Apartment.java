import java.util.Scanner;

/*Define entrance of a nine-storey apartment building according
to the specified apartment number N. There are M apartments on
each floor. Output the number of the entrance to the console. */

public class Apartment {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(), n= sc.nextInt();
    if (m<=0 || n<=0){
        System.out.println("Error");
    }
    else if(n%(9*m)>=1) {
        System.out.print("Entrance: ");
        System.out.println(n/(9 * m)+ 1);
    } else if (n%(9*m)==0) {
        System.out.print("Entrance: ");
        System.out.println(n/(9*m));

    }

    }


}
