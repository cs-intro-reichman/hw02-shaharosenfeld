/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum=1;
		String add = " 1";
		for(int i =2; i<num; i++)//check the sum of the dividing numbers
		{
			if(num%i == 0)
			{
				sum += i;
				add = add + " + " + i;
			}
		}
		if(sum == num)
		{
			System.out.println(num + " is a perfect number since "+ num + " =" + add);
		}
		else
		{
			System.out.println(num+ " is not a perfect number");
		}
	}
}
