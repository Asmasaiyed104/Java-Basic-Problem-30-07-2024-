public class LogicalOperator {

    public static void main(String[] args) {

       /* //&& AND
          T T = T
          T F = F
          F T = F
          F F = F

           ||
           F F = F

        */

        int x = 20;
        int y = 20;
        int a = 25;
        int b = 15;

        System.out.println((x>y) || (a < b));
        // F  T = F
        System.out.println((x >= y) && (a == b));
        // T  F = F
        //System.out.println((!((y <= y) && (a == b)));
        //F  F = F
        System.out.println((x > y) || (a <= b));
        // F T = F
        System.out.println((x > y) && (a >= b));
        // F   T  = T
        System.out.println(!(x <= y) || (a >= b));



    }


}
