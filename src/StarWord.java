
public class StarWord {
	
	//Java StringBuffer class is used to create mutable (modifiable) string.
	//Lets say you typed something in Scanner, and you want to change in, so
	//StringBuffer classes are used for creating mutable/changeable string.

	//declare data members
	private String word;
	private StringBuffer starWord;
	
	//constructor
	public StarWord() {
	}
	
	//stringBuffer
	StringBuffer sb = new StringBuffer();
	
	//setMethod
	public void setWord(String word) {
		this.word = word;
	}
	
	//compute methods
	
	//computeVowels
	public void computeVowels() {
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
				}
	}//end computeVowels
		
	
	//computeStars
	public void computeStars() {
		int length = word.length();
		for(int i = 0; i < length; i++) {
			sb.append('*');
		}	
	}//end computeStars
	
	//computePigLatin
	public void computePigLatin() {
		sb = new StringBuffer();
		int i = 1;
		while (i< word.length()) {
			char c = word.charAt(i);
			sb.append(c);
			i++;
		}
		sb.append(word.charAt(0));
		sb.append("ay");
	}//end PigLatin
	
	//reverseWord
	public void reverseWord() {
		int length = word.length();
		for(int i = length-1; i>=0; i--) {
			//retrieve the letter from at index i
			char w = word.charAt(i);
			sb.append(w);
		}
	}//end reverseWord
	
	//get method
	//inside the getter method we can make .toString();
	public String getStringBuffer() {
		return sb.toString();
	}
	
}//end class

