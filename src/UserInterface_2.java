import java.util.*;
public class UserInterface_2 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter a number for the multiplication table: ");
        int num = sc.nextInt();

        //  first initialize variable
        int i = 1;

        // print table with check condition
        // in while loop first check condition then increment
        while (i <= 10) {
            System.out.println(num  + " * "  + i  + " = " + (num * i ));
            i++;
        }

        sc.close();
    }
}

