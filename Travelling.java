import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        while (!country.equals("End")){

            double budget = Double.parseDouble(scanner.nextLine());
            double sum =0;

            while (budget>sum) {
                double money = Double.parseDouble(scanner.nextLine());
                sum += money;
            }

            System.out.printf("Going to %s!%n", country);
            country=scanner.nextLine();

        }
    }
}