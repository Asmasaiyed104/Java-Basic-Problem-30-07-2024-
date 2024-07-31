import java.util.*;
public class UserInterface_1 {

    public static void main(String[] args) {
        // we are taking input from system so
        // we are writing system.in
        // we are creating object of scanner
     Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first Number");
        // store variable into object
        int num1 = sc.nextInt();
        // print the object
        System.out.println("Enter the second Number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of two number is " + sum);

        // multiplication  or division

        int mul = num1 * num2;
        System.out.println("Mul of two number is " + mul);

        // division

        double div = num1 / num2;
        System.out.println("Div of two num  is " + div);



    }
}
