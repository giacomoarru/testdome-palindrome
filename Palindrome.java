public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] letters = word.toLowerCase().toCharArray();
    	
        int leftCursor = 0;
        int rightCursor = letters.length - 1;
        
    	while (true) {
    		if (leftCursor >= rightCursor)
    			return true;
    		
    		if (letters[leftCursor] != letters[rightCursor])
    			return false;
    		
    		leftCursor++;
    		rightCursor--;
 
    	}
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}