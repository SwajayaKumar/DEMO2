

public class ReverseString {

	public static void main(String[] args) {
	
		String str= "bapu";
		String revString= " ";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			revString= ch+ revString;
		}
		System.out.println(revString);
	}	
}
