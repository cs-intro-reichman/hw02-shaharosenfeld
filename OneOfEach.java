
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.concurrent.ThreadLocalRandom;
public class OneOfEach {
	public static void main (String[] args) {
		int boyGirl = ThreadLocalRandom.current().nextInt(0, 2);
		boolean check = true;
		boolean boy = false;
		boolean girl = false;
		int kidCounter = 0;
		while(check)
		{
			if(boyGirl == 0)
			{
				System.out.print("g");
				girl = true;
				kidCounter++;
			}
			if(boyGirl == 1)
			{
				System.out.print("b");
				boy = true;
				kidCounter++;
			}
			if(boy && girl)//exit if you have both
			{
				check = false;
			}
			boyGirl = ThreadLocalRandom.current().nextInt(0, 2);
		}
		System.out.println("");
		System.out.println("You made it... and you now have "+kidCounter+" children.");
	}
}
