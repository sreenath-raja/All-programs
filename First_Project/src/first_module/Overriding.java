package first_module;

public class Overriding extends MethodOverriding {
	
	
	@Override
	public void Sree(String a) {
		// TODO Auto-generated method stub
		super.Sree(a);
		System.out.println("porur");
	}
	
	public static void main(String[] args) {
		MethodOverriding method=new Overriding();
		method.Sree("10");
	}

}
