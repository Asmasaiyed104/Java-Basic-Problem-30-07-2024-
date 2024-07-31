import java.util.*;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Name");

        String name = scn.nextLine();
        System.out.println("Name is:" + name);
        System.out.println("Enter Your Age");
        int age = scn.nextInt();
        System.out.println("Enter your number");
        scn.close();
    }

}
