import java.util.Scanner;

public class Day {

    public static String dayName(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid please input 1-7:)";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day(1-7): ");
        int day = input.nextInt();

        System.out.print("Today is " + dayName(day));

        input.close();
    }
}
