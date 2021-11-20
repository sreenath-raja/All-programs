package first_module;

public class SelectionStatement {

	public static void main(String[] args) {

		String a = "Arun";
		String b = "Kumar";
		for (int i = 0; i < 10; i++) {
			if (i <= 5) {
				System.out.println("The name is " + a);
			} else if (i > 5) {
				System.out.println("The name is " + b);
			} else {
				System.out.println("Invalid condition");
			}
		}
	}
}
