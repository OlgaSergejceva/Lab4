import java.util.Scanner;
public class StarWordApp {
	
	public static void main(String[] args) {
	
	//declare local variables
	String word;
	int method;
	String answer = "yes";
	
	//declare objects
	StarWord myStar = new StarWord();
	do {//input use do while loop
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");//"Please enter a word"
		word = sc.next();
		
		//"Please choose which method to use"
		System.out.println("Please choose which method to use: 1 - computeVowels, 2 - computeStars, 3 - computePigLatin, 4 - reverseWord" );
		method = sc.nextInt();
		
		//process
		myStar.setWord(word);

		//output
		//"The word: " + word + "with STARS compute method is" + starWord
		
		switch(method) {
		case 1:
			myStar.computeVowels();
			System.out.println("The word: " + word + " with vowels method is: " + myStar.getStringBuffer());
			break;
		case 2:
			myStar.computeStars();
			System.out.println("The word: " + word + " with stars method is: " + myStar.getStringBuffer());
			break;
		case 3:
			myStar.computePigLatin();
			System.out.println("The word: " + word + " with Pig Latin method is: " + myStar.getStringBuffer());
			break;
		case 4:
			myStar.reverseWord();
			System.out.println("The word: " + word + " with word reverse method is: " + myStar.getStringBuffer());
			break;
			default:
				System.out.println("Please check your input");
		}
	
		//"Do you wish to continue? y/n"
		System.out.println("Do you wish to continue? Yes or No: ");
		answer = sc.next();
		
	}while(answer.equalsIgnoreCase("yes")) ;
	
	if(answer.equalsIgnoreCase("no")) {
	System.out.println("The program has finished.");
	}	
		
}//end main		
}//end class
