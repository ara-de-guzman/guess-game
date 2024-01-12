import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int correctNumber = (int) Math.round(Math.random() * 20);
        int guess = 0;
        int attempt = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 20");

        while(guess != correctNumber) {
            guess= scan.nextInt();

            if(guess == correctNumber) {
                System.out.println("You got it right");
                System.out.println("Your tried " + attempt + " attempt(s) ");

            }else {
                System.out.println("Your wrong please try again");
            }
            attempt++;

        }

    }



}