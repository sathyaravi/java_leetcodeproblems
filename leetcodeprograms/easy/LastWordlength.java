package leetcodeprograms.easy;

public class LastWordlength {

	public static void main(String[] args) {
		
		 String s = "Hello Java";
		 String[] words = s.split("\\s+");
	     int last_word_length=words[words.length-1].length();
	     System.out.println(last_word_length); 

	}

}
