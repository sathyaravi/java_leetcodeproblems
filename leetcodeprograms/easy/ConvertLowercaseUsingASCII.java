package leetcodeprograms.easy;

public class ConvertLowercaseUsingASCII {

	public static void main(String[] args) {
		
		System.out.println(convertLowercase("HELLO"));
		System.out.println(convertLowercase("jAvA"));
		System.out.println(convertLowercase("pRograMMing"));

	}
	
	public static String convertLowercase(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			/*Uppercase letters range from 65 to 90 ('A' to 'Z').
Lowercase letters range from 97 to 122 ('a' to 'z').
*/
			
			if(ch>='A' && ch<='Z') {
				
				ch = (char)(ch+32);
			}
			sb.append(ch);
		}
		
		return sb.toString();

	}

}
