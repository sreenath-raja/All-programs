package first_module;

public class MethodOverloading {
	int a;
	int b;
	
	public void method1(int a) {
		int c=a+b;
		//System.out.println(a);
	}

	
	  public void method1(String b) { 
		  System.out.println(b);
	  
	  } public void method1(float c) {
		  System.out.println(c);
	  
	  }
	 
	public static void main(String[] args) {
		MethodOverloading tech = new MethodOverloading();
		
		//Integer c = new Integer(342);
		Integer d = new Integer(34);
         int s= Integer.valueOf(d);
		System.out.println(String.valueOf(s));

		tech.method1(123);
		tech.method1("sree");
		tech.method1(0.1f);
		 
	}

}
