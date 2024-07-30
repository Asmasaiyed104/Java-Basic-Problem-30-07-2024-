public class BankAccProb {
    /* Problem 4: Bank Account Balance Checker

Problem Statement:
Create a program that checks a bank account balance and prints out different messages based on the balance amount.

Requirements:
If the balance is greater than or equal to $1000, print "You have a healthy balance."
If the balance is between $500 and $999, print "Your balance is adequate."
If the balance is between $100 and $499, print "Your balance is low."
If the balance is less than $100, print "Warning: Your balance is very low."

Sample Input:
double balance = 350.50;

Sample Output:
Your balance is low.


     */

    public static void main(String[] args) {
        double balance = 350.50;

        if (balance >= 1000){
            System.out.println("You have a healthy balance");
        } else if (balance >= 500  && balance <=999 ) {
            System.out.println("Your balance is adequate");
        } else if (balance >= 100 && balance <=499) {
            System.out.println("Your balance is low");
        } else if (balance <=100) {
            System.out.println("Warning: Your balance is very low");
        }



    }

}
