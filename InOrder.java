/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.concurrent.ThreadLocalRandom;
public class InOrder {
	public static void main (String[] args) {
		boolean check = true;
		int lastNum = ThreadLocalRandom.current().nextInt(0, 10);//getting a random number within the range
		int newNum=0;
		System.out.print(lastNum);//print of the first random number
		while(check)
		{
			newNum = ThreadLocalRandom.current().nextInt(0, 10);
			if(newNum >= lastNum)
			{
				lastNum = newNum;
				System.out.print(" "+lastNum);
			}
			else{
				check = false;
			}		
		}
		System.out.println();
	}
}
