import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);

        int numberStrLength = numberStr.length();

        String lastDigit = numberStr.substring(numberStrLength - 1);

        System.out.println("Last digit is " + lastDigit);
    }
}