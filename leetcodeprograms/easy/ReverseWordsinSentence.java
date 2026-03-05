package leetcodeprograms.easy;

public class ReverseWordsinSentence {

	public static void main(String[] args) {
	    
		String s = "Let's take LeetCode contest";
		
        String[] words=s.split("\\s+");

        StringBuilder reversed_string=new StringBuilder();

        for(String w:words){

            for(int i=w.length()-1;i>=0;i--){
                
            	reversed_string.append(w.charAt(i));
            
            }
            reversed_string.append(" ");
            }
           System.out.println(reversed_string.toString().trim()); 

	}

}
