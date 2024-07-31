import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {

        System.out.println();
        /*
        * switch(int_type) {
        * case int_type
        * //logic
        *
        * case int _type:
        * //logic
        * break;
        *
        * case int_type
        * //logic
        * break;
        * }
        * it takes input any kind of int, string, char
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input of switch");
       int input = sc.nextInt();

       switch (input){
           case 1:
               System.out.println("Hello I am in case 1");
               break;

           case 2:
               System.out.println("Hello I am in case 2");
               break;
           case 3:
               System.out.println("Hello I am in case 3");
               break;
       }

    }
}
