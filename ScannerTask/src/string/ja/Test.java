package string.ja;

public class Test {
	public static void main(String[] args) {
		StringBuffer S = new StringBuffer("MadaS");
		System.out.println("stringbuffer is " + S);
		
		StringBuffer A = S.reverse();
		System.out.println("reverse name is " + A);
		
		if (S==A) {
			System.out.println(" It is palindrome");
		}
			else {
				System.out.println("it is not palindrome");
			}

	}
}
