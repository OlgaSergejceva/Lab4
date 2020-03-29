import java.util.Scanner;

/**
Develop an application that accepts a one word message from the user as input. The application should then encode the word and output the encoded word by reversing the word and replacing all of the vowels with numbers as
follows: a = 1, e = 5, i = 9, o = 15 and u = 21.
For example, if the user enters Programming the application should create the new word:
gn9mm1rg15rP
*/

public class Encoder {
	public static void main(String[] args) {
		//declaration
		String word;
		
		//declare a variable of type Scanner and create an object of type Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.println("Enter a one word: ");
		word = keyboard.next();
		
		//create an object of type StringBuffer to build the encoded word
		StringBuffer sb = new StringBuffer();
		
		//len - the number of chars in the word
		int len = word.length();
		//vowels: a = 1, e = 5, i = 9, o = 15 and u = 21
		for(int i = len-1; i >= 0; i-=1) {
			//retrieve the char from the word located at the index i, and store ii in variable l
			char l = word.charAt(i);
			if(l=='a' || l=='A') {
				//add 1 to the encoded word
				sb.append(1);
			}else if (l=='i' || l=='I') {
				sb.append(9);
			}else if (l=='e' || l=='E') {
				sb.append(5);
			}else if (l=='o' || l=='O') {
				sb.append(15);
			}else if (l=='u' || l=='U') {
				sb.append(21);
			}else {
				//if the letter is not vowels then add the letter itself to the encoded word
				sb.append(l);
			}
			
		}//for
		
		//store the encoded word into a String variable to convert the StringBuffer object to a String
		String encoded = sb.toString();
		System.out.println("Encoded word: " + encoded);

	}//end main
}//end class
