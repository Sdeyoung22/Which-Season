import java.util.Scanner;

/**
 * 
 * @author Sdeyoung22
 *
 */
public class WhichSeason
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("WHICH SEASON?");
		System.out.print("Press enter to start");
		input.nextLine();
		System.out.print("Enter the numerical value of your birth month:  ");
		int mnth = input.nextInt();
		
		if (mnth < 1 || mnth > 12)
			System.out.print("INVALID MONTH");
		else if (mnth >= 3 && mnth <= 5)
		{
			System.out.print("You were born in Spring!");
		}
		else if (mnth >= 6 && mnth <= 8)
		{
			System.out.print("You were born in Summer!");
		}
		else if (mnth >= 9 && mnth <= 11)
		{
			System.out.print("You were born in Autumn!");
		}
		else if (mnth == 12 || mnth <= 2)
		{
			System.out.print("You were born in Winter!");
		}
		

	}

}
