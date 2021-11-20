package first_module;

public  class FinalKeyword {

	final int a=10;
	
	public  void name() {
		
		System.out.println("Hello world");
		//System.out.println("Hi my name is Arun " +b);
		
	}
	
	
	public static void main(String[] args) {
		
		FinalKeyword fk=new FinalKeyword();
		fk.name();
		System.out.println(fk.a);
		
	}
	
	
}
