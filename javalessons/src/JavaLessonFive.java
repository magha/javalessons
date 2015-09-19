import java.util.Scanner;

public class JavaLessonFive {
	
	static int randomNumber;
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1)
		{
			System.out.println("Guess a number (1-20): ");
			
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		System.out.println("Yes, the number is " + randomGuess);
	}
	
	public static int getRandomNum ()
	{
		randomNumber = (int)(Math.random()*21);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if(guess == randomNumber)
			return -1;
		else
			return guess;
	}
}