package leetcodeprograms.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		
		int start=0;int end=s.length()-1;
		
		while(start<end) {
			
			char firstChar=s.charAt(start);
			char lastChar=s.charAt(end);
			
			if(!Character.isLetterOrDigit(firstChar)) {
				
				start++;
			}
			else if(!Character.isLetterOrDigit(lastChar)) {
				
				end--;
			}
			else if(Character.toLowerCase(firstChar)!=Character.toLowerCase(lastChar)) {
				
				return false;
			}
			else {
				
				start++;
				end--;
			}
		}
		
		return true;
		
		
	}

}
