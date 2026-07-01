import java.util.Scanner;

public class Grading {

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter your Grade: ");

        int myScore  = scanner.nextInt();

        String myGrade = getGrade(myScore);
        System.out.println("Final remarks: " + myGrade);

        scanner.close();
    }
}





