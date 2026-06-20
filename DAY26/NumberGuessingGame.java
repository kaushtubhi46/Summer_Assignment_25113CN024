import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();//creating random object.
        char play = 'Y';//used to control if the player wants to replay.
        while(play == 'Y'||play == 'y'){//repeat the game until the player say N.
            int secretno = random.nextInt(100)+1;//generate random number from 1-100.
            int maxAttempts = 7;//max number of gusses allowed.
            boolean guessed = false; //stores whether the number is gussed or not.
            int attempts = 0;//counts number of attempts made.
            while(attempts < maxAttempts){//run untill max no of attempts are used.
                System.out.print("Attempt "+(attempts+1)+"/"+maxAttempts+" - Enter your guess (1-100): ");
                int guess = sc.nextInt();//take the guess no form user.
                attempts++;//increase the attempt count after every turn.
                if(guess < 1||guess > 100){
                    System.out.println("\nPlease enter a number between 1 and 100.");
                    attempts--;
                    continue;
                }
                if(guess < secretno){//if guess no is smaller.
                    System.out.println("Too low!");
                }
                else if(guess > secretno){//if guess no is larger.
                    System.out.println("Too high!");
                }
                else{//when the match is found.
                    guessed = true;//the no. is gussed so true.
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts : "+attempts);//print the no. of attempts made.
                    break;//exit this guessing loop .
                }
                if(attempts<maxAttempts){//show remaining attempts after a wrong guess.
                    System.out.println("Attempts Left: " + (maxAttempts - attempts));
                }
            }
            if(!guessed){//if not able to guess and attempts are over.
                System.out.println("Game Over!");
                System.out.println("Correct Number: "+secretno);//print the correct random number.
            }
            System.out.print("Play Again? (Y/N): ");
            play = sc.next().charAt(0);//taking user's choice to restart or end the game.
        }
        sc.close();
    }
}