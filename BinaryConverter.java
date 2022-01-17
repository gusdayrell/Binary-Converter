
import java.util.Scanner;

/**
*
* This is a program to convert a decimal integer number into it's binary representation.
*
* @author Gustavo Dayrell
* @version 1.0
*/

public class BinaryConverter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a whole decimal number: ");

		// Getting user input number.
		int userNumber = Integer.parseInt(keyboard.nextLine());

		// Invoking getBinary method
		String binaryNumber = getBinary(userNumber);

		// Printing out converted binary number into the console.
		System.out.printf("%d in binary is %s.%n", userNumber, binaryNumber);
	}

	// Creating the getBinary Method to convert user input integer value into binary
	public static String getBinary(int userInput)
	{
		String binaryNumber = "";
		int quotient = userInput;

		// loop start
		while(quotient > 0)
		{
			int reminder = quotient % 2;

				quotient = quotient / 2;

				reminder = reminder % 2;

			binaryNumber = reminder +  binaryNumber;
		}

		return binaryNumber;
	}
		}


