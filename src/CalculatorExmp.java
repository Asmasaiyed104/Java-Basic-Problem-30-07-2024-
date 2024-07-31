import java.util.*;

public class CalculatorExmp {

    // main method
    public static void main(String[] args) {
        System.out.println("******************");
        System.out.println("Welcome to My Calculator");
        System.out.println("******************");
  // scanner input for use , whatever user you use  enter it
        Scanner sc = new Scanner(System.in);
// before to enter scanner , check condition with following output , if suppose you want to check
        // addition  enter 1, for multiplication enter 2, for sub enter 3, for div 4, for mod 5,
        // for 0 to check condition with goodbye exit
        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Subtraction");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");

            // with scanner object sc store input as a integer
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("Exit from my calc.😊🙋‍♀️Goodbye!");
                break;
            }
            // print two number for all switch input
            System.out.println(" Enter the first number:");
            int num1 = sc.nextInt();
            System.out.println(" Enter the second number:");
            int num2 = sc.nextInt();

            switch(input) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println(" Result of Addition ➕: " + sum);
                    break;
                case 2:
                    int product = num1 * num2;
                    System.out.println(" Result of Multiplication ✖️: " + product);
                    break;
                case 3:
                    int difference = num1 - num2;
                    System.out.println(" Result of Subtraction ➖: " + difference);
                    break;
                case 4:
                    if (num2 != 0) {
                        double x = (double) num1 /num2;
                        System.out.println(" Result of Division ➗: " +  x);
                    } else {
                        System.out.println(" div by zero is not allowed");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        int modulus = num1 % num2 ;
                        System.out.println(" Result of Modulus : " + modulus);
                    } else {
                        System.out.println(" mod is not allowed.");
                    }
                    break;
                default:
                    System.out.println(" Wrong input apply, Please try again.");
            }
        }

        sc.close();
    }
}
