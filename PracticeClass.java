public class PracticeClass {
public static void main(String[] args) {
	
	
	String word="Madam", reverse="";
	
	for(int i=0;i<word.length();i++) {
		
		reverse=word.charAt(i)+reverse;
	}
	
	if(word.equalsIgnoreCase(reverse)){
		System.out.println(word+" is a Palindrome");
	}
	else {
		System.out.println(word+" is not a Palindrome");
	}
}
}
