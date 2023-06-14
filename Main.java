import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");

        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Podana liczba " + number + " jest całkowita.");
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest liczbą całkowitą.");
        }

        scanner.close();
    }
}