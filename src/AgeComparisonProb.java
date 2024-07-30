public class AgeComparisonProb {

    /*Problem 2: Age Comparison

Problem Statement:
Write a program that compares the ages of two people and prints out who is older, younger, or if they are the same age.

Requirements:
Input the ages of two people.
Print out whether the first person is older, younger, or the same age as the second person.

Sample Input:
int agePerson1 = 25;
int agePerson2 = 30;
 */
    public static void main(String[] args) {
        int agePerson1 = 25;
        int agePerson2 = 30;
        if (agePerson1 < agePerson2){
            System.out.println("Younger");
        } else if (agePerson1 > agePerson2) {
            System.out.println("older");
        } else  {
            System.out.println("same age as the second person");

        }

    }
}
