public class GradingSysProb {
    public static void main(String[] args) {
        int score = 90;

        if (score <= 40) {
            System.out.println("Fail");

        } else if (score >=40 && score <= 50) {
            System.out.println("C grade");
        } else if (score >= 50 && score <= 60) {
            System.out.println("C+ Grade");
        } else if (score > 60 && score <= 70) {
            System.out.println("B grade");
        } else if (score >70 && score <= 80) {
            System.out.println("B+ grade");
        } else if (score >80 && score <= 90) {
            System.out.println("A grade");
        } else if (score > 90 && score <= 100) {
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Nothing");
        }

        }


    }

