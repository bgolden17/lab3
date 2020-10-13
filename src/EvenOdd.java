import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name.\n");
		String userName = in.nextLine();
		System.out.println(userName + ", please enter a number between 1 and 100.\n");
		int userNumber = in.nextInt();
		
		while (userNumber > 100 || userNumber < 1)
		{
			System.out.println(userName + ", your number was not between 1 and 100. Please enter a different number.\n");
			userNumber = in.nextInt();
		}
		
		int	evenOdd = userNumber % 2;
		
		if (evenOdd == 1)
		{
			if (userNumber > 60) 
			{
				System.out.println(userNumber + " Odd and over 60.\n");
			}
			else
			{
				System.out.println(userNumber + " Odd.\n");
			}		
		}	
		else
		{
			if (userNumber < 25) 
			{
				System.out.println("Even and less than 25.\n");
			}
			else if (userNumber > 25 && userNumber < 61) 
			{
				System.out.println("Even.\n");
			}
			else
			{
				System.out.println(userNumber + " Even.\n");
			}		
		}
	}
}