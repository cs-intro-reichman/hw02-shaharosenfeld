import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		double boyGirl = generator.nextDouble();  
		boolean check = true;
		boolean boy = false;
		boolean girl = false;
		int kidCounter = 0;
		//variable above from last code
		double avgSum =0;
		int twoKid=0;
		int threeKid=0;
		int fourOrMore=0;
		//int T = Integer.parseInt(args[0]);
		for(int i=0; i<T; i++)//simulates familys T times
		{
			while(check)//family simulation
			{
				kidCounter++;
				if(boyGirl <= 0.5)
				{
					girl = true;
				}
				if(boyGirl > 0.5)
				{
					boy = true;
				}
				if(boy && girl)//exit if you have both
				{
					check = false;
				}
				boyGirl = generator.nextDouble();
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
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
