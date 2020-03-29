import java.util.Scanner;
public class PigLatinApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.next();
		
		PigLatin myPig = new PigLatin();
		myPig.setWord(word);
		myPig.translate();
		
		String piggy = myPig.getPig();
		System.out.println("Converted word is: " + piggy);

	}

}
