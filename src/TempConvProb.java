public class TempConvProb {
    /*
    * Problem 5: Temperature Converter and Adviser

Problem Statement:
Design a program that converts temperature from Celsius to Fahrenheit and provides advice based on the temperature.

Requirements:
Convert the input temperature from Celsius to Fahrenheit.
If the Fahrenheit temperature is 85 or above, print "It's hot outside."
If the Fahrenheit temperature is between 60 and 84, print "The weather is pleasant."
If the Fahrenheit temperature is below 60, print "It's cold outside."

Sample Input:
double celsius = 20;

Sample Output:
Temperature in Fahrenheit: 68.0
The weather is pleasant.*/

    public static void main(String[] args) {

        double celsius = 20;
        double converter = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + converter );

        if (converter >=85){
            System.out.println("It's hot outside.");
        } else if (converter >= 60 && converter<=84) {
            System.out.println("The weather is pleasant.");
        } else if (converter <60) {
            System.out.println("It's cold outside.");
        }


    }
}
