import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int input = -1;
            int count = 0;
            int number = random.nextInt(10);
            while (count < 3 && input != number) {
                System.out.println("It's your " + (count + 1) + " shot out of 3 to guess the number from 0 to 9!");
                try {
                    input = sc.nextInt();
                    if (input == number) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("Your number is " + ((input > number) ? "higher." : "lower."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Enter the NUMBER from 0 to 9!");
                    sc.next();
                }
            }
            if(count == 3)
                System.out.println("You lost!");
                System.out.println("One more time? 1 - yes / 0 - no");
            } while (sc.next().equals("1"));
    }
}