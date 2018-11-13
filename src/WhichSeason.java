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
		System.out.print("Enter the numerical value of a month:  ");
		int mnth = input.nextInt();
		
		if (mnth < 1 || mnth > 12)
			System.out.print("INVALID MONTH");
		else if (mnth >= 3 && mnth <= 5);
		

	}

}
