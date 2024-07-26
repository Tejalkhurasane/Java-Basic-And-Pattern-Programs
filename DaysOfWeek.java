import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = Integer.parseInt(sc.nextLine());

        if (month < 8) {
            if (month % 2 == 0) {
                System.out.println("It has 30 days.");
            } else {
                System.out.println("It has 31 days.");
            }
        } else {
            if (month % 2 == 0) {
                System.out.println("It has 31 days.");
            } else {
                System.out.println("It has 30 days.");
            }
        }
    }
}
