/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
import java.util.concurrent.ThreadLocalRandom;
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int boyGirl = ThreadLocalRandom.current().nextInt(0, 2);
		boolean check = true;
		boolean boy = false;
		boolean girl = false;
		int kidCounter = 0;
		//variable above from last code
		double avgSum =0;
		int twoKid=0;
		int threeKid=0;
		int fourOrMore=0;
		int T = Integer.parseInt(args[0]);
		for(int i=0; i<T; i++)//simulates familys T times
		{
			while(check)//family simulation
			{
				kidCounter++;
				if(boyGirl == 0)
				{
					girl = true;
				}
				if(boyGirl == 1)
				{
					boy = true;
				}
				if(boy && girl)//exit if you have both
				{
					check = false;
				}
				boyGirl = ThreadLocalRandom.current().nextInt(0, 2);
			}
			avgSum = avgSum + kidCounter;
			if(kidCounter == 2)//check how many kids it took
			{
				twoKid++;
			}
			else if(kidCounter == 3)
			{
				threeKid++;
			}
			else
			{
				fourOrMore++;
			}
			kidCounter = 0;
			check = true;
			girl = false;
			boy = false;
		}
		avgSum = avgSum/(twoKid+threeKid+fourOrMore);
		System.out.println("Average: "+avgSum+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+twoKid);
		System.out.println("Number of families with 3 children: "+threeKid);
		System.out.println("Number of families with 4 or more children: "+fourOrMore);
		if(twoKid>=threeKid && twoKid>=fourOrMore)
		{
			System.out.println("The most common number of children is 2.");
		}
		else if(threeKid>fourOrMore)
		{
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4.");
		}
	}
}
