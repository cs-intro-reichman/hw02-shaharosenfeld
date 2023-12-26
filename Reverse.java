/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int first=1;
		int last = word.length()-1;//first and last will find the middle when they meet
		char middle ='.';
		int charPlace = 0;
		for(int i=word.length() - 1; i>=0; i--)//loop that prints the string backwords
		{
			System.out.print(word.charAt(i));
		}
		System.out.println();
		while(first < last)//loop to find the middle character
		{
			first++;
			last--;
			charPlace++;
		}
		middle = word.charAt(charPlace);
		System.out.println("The middle character is "+middle);
	}
}
