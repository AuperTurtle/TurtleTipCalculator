import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        int people = scan.nextInt();
        scan.nextLine();
        while (people < 1) {
            System.out.println("Number of people has to be a positive and greater than zero, try again.");
            people = scan.nextInt();
        }

        System.out.println("What's the tip percentage? (0-100):");
        int tipPercent = scan.nextInt();
        while ((tipPercent < -1) && (tipPercent > 101)) {
            System.out.println("Tip percentage has to be between 0 and 100.");
            tipPercent = scan.nextInt();

        }

        double checkEnd = 0;
        double totalCost = 0;
        while (checkEnd != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end):");
            checkEnd = scan.nextDouble();
            if (checkEnd > 0) {
                totalCost = (totalCost + checkEnd);
                System.out.println(totalCost);
            }
        }


    }
}
