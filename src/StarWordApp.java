import java.util.Scanner;
public class StarWordApp {
	
	//declare local variables
	String word;
	int method;
	
	//declare objects
	StarWord starWord = new StarWord();
	do {//input use do while loop
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");//"Please enter a word"
		word = sc.next();
		
		//"Please choose which method to use"
		System.out.println("Please choose which method to use: 1 - computeVowels, 2 - computeStars, 3 - computePigLatin, 4 - reverseWord" );
		method = sc.nextInt();
		
		//process
		starWord.setWord(word);

		//output
		//"The word: " + word + "with STARS compute method is" + starWord
		
		switch(method) {
		case 1:
			starWord.computeVowels();
			System.out.println("The word: " + word + " with vowels method is: " + starWord.getStringBuffer());
			break;
		case 2:
			starWord.computeStars();
			System.out.println("The word: " + word + " with stars method is: " + starWord.getStringBuffer());
			break;
		case 3:
			starWord.computePigLatin();
			System.out.println("The word: " + word + " with Pig Latin method is: " + starWord.getStringBuffer());
			break;
		case 4:
			starWord.reverseWord();
			System.out.println("The word: " + word + " with word reverse method is: " + starWord.getStringBuffer());
			break;
			default:
				System.out.println("Please check your input");
		}
	
		//"Do you wish to continue? y/n"
		System.out.println("Do you wish to continue? Yes or No: ");
		String answer = sc.next();
		
	}while(answer.equalsIgnoreCase("yes")) ;
	
	if(answer.equalsIgnoreCase("no")) {
	System.out.println("The program has finished.");
	}	
		
}//end main		
}//end class
