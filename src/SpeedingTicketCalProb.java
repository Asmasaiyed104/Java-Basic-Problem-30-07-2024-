public class SpeedingTicketCalProb {
    /*Problem 3: Speeding Ticket Calculator

Problem Statement:
You are designing a speeding ticket calculator for the local traffic authority. The program should determine the amount of the speeding ticket based on the speed of the driver and the speed limit.

Requirements:
If the speed is within the limit, print "No ticket".
If the speed is up to 10 mph over the limit, print "Small ticket".
If the speed is more than 10 mph over the limit, print "Big ticket".

Sample Input:
int speed = 75;
int speedLimit = 65;

Sample Output:
Small ticket*/

    public static void main(String[] args) {

        int speed = 75;
        int speedLimit =65;
        String ticket = calculateTicket(speed, speedLimit);
        System.out.println(ticket);
    }

    public static String calculateTicket(int speed, int speedLimit) {
        if (speed <= speedLimit) {
            return "No ticket";
        } else if (speed <= speedLimit + 10) {
            return "Small ticket";
        } else {
            return "Big ticket";
        }
    }
}