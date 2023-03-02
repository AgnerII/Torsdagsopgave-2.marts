import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){  

        Scanner scanner = new Scanner(System.in);	 

    	int input = scanner.nextInt();

        if(!scanner.hasNextDouble()){
            System.out.println("Not a numeric number, try again");

        }

        if(input == rnd_number){

            System.out.println("Wow, you read my mind");
            scanner.close();
            return;

        }else{

        
            System.out.println("Nope, try again");

            if(input<rnd_number){

                System.out.println("You have to guess higher than that..");

            }else{

                System.out.println("You have to guess lower than that..");
            }
        }
            makeAGuess();
    }

}