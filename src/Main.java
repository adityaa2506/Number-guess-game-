import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        heading();
        randomNumber();

    }
    public static void heading(){
        System.out.println("     ██████╗ ██╗   ██╗███████╗███████╗███████╗    ███╗   ██╗██╗   ██╗███╗   ███╗██████╗ ███████╗██████╗ ");
        System.out.println("    ██╔════╝ ██║   ██║██╔════╝██╔════╝██╔════╝    ████╗  ██║██║   ██║████╗ ████║██╔══██╗██╔════╝██╔══██╗");
        System.out.println("    ██║  ███╗██║   ██║█████╗  ███████╗███████╗    ██╔██╗ ██║██║   ██║██╔████╔██║██████╔╝█████╗  ██████╔╝");
        System.out.println("    ██║   ██║██║   ██║██╔══╝  ╚════██║╚════██║    ██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██╗██╔══╝  ██╔══██╗");
        System.out.println("    ╚██████╔╝╚██████╔╝███████╗███████║███████║    ██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██████╔╝███████╗██║  ██║");
        System.out.println("     ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚══════╝    ╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═╝");
        System.out.println("                                                                                                     ");
        System.out.println();
        System.out.println("The system will generate a random number between 0-100");
        System.out.println("You will get 5 chances to guess the number.");
        System.out.println("Guess Counter will be shown after every Guess.");
        System.out.println();
        System.out.println();
    }
    public static void randomNumber(){
        int number = (int)(Math.random() * 101);
        //System.out.println("random number "  + number);
        result(number);
    }
    public static void  result(int number){
        int count =5;
        int i = 1;
        int tries  = 5;
        while (i <= count){
            System.out.print("Enter your number : ");
            int guess = getValidatedIntInput();
            if (guess == number){
                System.out.println("You Guess it correct in "+ i + " Try");
                break;
            }
            else {
                if (guess>number){
                    tries = 5-i;
                    System.out.println("Tries Remaining : "+ tries);
                    if (tries !=0){System.out.println("Please decrease your guess value.");}

                }
                else {
                    tries =5-i;
                    System.out.println("Tries Remaining : "+ tries);
                    if (tries !=0){System.out.println("Please increase your guess value.");}
                }
                i++;

            }
        }
        System.out.println("The correct number was : "+number);
        System.out.println("Better Luck Next time :(");
        playAgain();
    }
    public static void playAgain(){
        System.out.print("Please Select the Option\n1)Play Again\n2)Exit\nPlease Choose your input : ");
        int input = sc.nextInt();
        if (input == 1){
            randomNumber();
        } else if (input == 2) {
            System.exit(0);
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
    public static int getValidatedIntInput() {
        int input;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next(); // Discard invalid input
            }
            input = sc.nextInt();

            if (input >= 0 && input <= 100) {
                return input;
            } else {
                System.out.print("Number must be between 0 and 100. Try again: ");
            }
        }
    }


}
