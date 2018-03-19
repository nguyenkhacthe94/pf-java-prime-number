import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number < 2) System.out.print(number + " is not a prime number");
        else {
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(number)) {
                if (number % i ==0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.print(number + " is a prime number.");
            else System.out.print(number + " is not a prime number");
        }
    }
}
