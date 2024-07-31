import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        // Print numbers and calculate the sum
        while (num <= 10) {
            System.out.println("Number: " + num);
            sum += num;
            num++;
        }

        // Print the sum of all numbers
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        int x = 0;

        // Print "hello" 10 times
        while (x < 10) {
            System.out.println("hello");
            x++;
        }
    }
}
