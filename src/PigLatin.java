
public class PigLatin {
	private String word;
	private String pig;
	private StringBuffer sb;
	
	public PigLatin() {}
	
	public void setWord(String w) {
		this.word = w;
	}
	
	public void translate() {
		sb = new StringBuffer();
		int i = 1;
		while (i< word.length()) {
			char c = word.charAt(i);
			sb.append(c);
			i++;
		}//end while
		
		sb.append(word.charAt(0));
		sb.append("ay");
		pig = sb.toString();
	}

	public String getPig() {
		return pig;	
	}
}
