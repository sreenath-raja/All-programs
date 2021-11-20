package first_module;

public class Constructor {
	
	public Constructor() {
		System.out.println("I am a default Constructor");
	}
	
	public Constructor(int a)
	{
		System.out.println("I am a parameterised Constructor " +a);
	}
	
	public void ndnfkdsj(String b, float f)
	{
		System.out.println(b +" I am a normal method " +f);
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor c1=new Constructor(100);
		c.ndnfkdsj("Arun", 10.7f);
	}

}
