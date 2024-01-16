package CodIntern;

import java.util.Random;
import java.util.Scanner;

public class taskOne{
  static Random randomNum;
  static int numGen;
  static int userGuess;

  public static int RandNum(int num){
     randomNum = new Random();
     numGen = randomNum.nextInt(num);
    return numGen;
  }

   public void guessNum(){
     
    int attempts = 1; //count no. of attempts
    int secretNumber = RandNum(100);
     // the secret number 
     
    try (Scanner input = new Scanner(System.in)) {
		System.out.println("Guess a number in between 1 and 100");
		
		while(true){

		 System.out.println("Your guess #"+attempts+":"); 
		 userGuess = input.nextInt();
		 input.nextLine(); //to consume new line character *
		 attempts++;
		  
		  if(attempts == 11){
		    System.out.println("You have reached the maximum number of attempts");
		   System.out.println("Would you like to play again? YES OR NO ?");
		    String playAgain = input.nextLine();

		    if(playAgain.equals("YES") || playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("y") || playAgain.equals("Y")){
		      attempts = 1;
		      continue;
		    }
		    else{
		      System.out.println("Thank you for playing");
		      System.out.println("The secret number was: " + secretNumber);
		      break;
		    }
		  }
		  if(userGuess == numGen ) {
		    System.out.println("You guessed the number!");
		    System.out.println("You made " +attempts+" attempts");
		    System.out.println("Would you like to play again? YES OR NO ?");
		    String playAgain =   input.nextLine();
		    if(playAgain.equals("YES") || playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("y") || playAgain.equals("Y")){
		      attempts = 1;
		      continue;
		    }
		    if(playAgain.equals("NO")){
		      System.out.println("Thank you for playing");
		      break;
		    }
		  }
		  if(userGuess > numGen){
		    System.out.println("Your guess is too high!");
		    System.out.println("Guess a number in between 1 and 100");
		  } 
		  if(userGuess < numGen){
		    System.out.println("Your guess is too low!");
		    System.out.println("Guess a number in between 1 and 100");
		  }
		}
	}
   }
   
   public static void main(String[]args) {
	   taskOne play = new taskOne();
	   play.guessNum();
   }
}