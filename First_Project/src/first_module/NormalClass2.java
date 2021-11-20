package first_module;

public class NormalClass2 implements Interface2 , Interface3{

	@Override
	public void carLoan() {
System.out.println("Car Loan");		
	}

	@Override
	public void homeLoan() {
		System.out.println("Home Loan");			
	}

	@Override
	public void bikeLoan() {
		System.out.println("Bike Loan");			
	}
	
public static void main(String[] args) {
	NormalClass2 Ncl= new NormalClass2();
	Ncl.carLoan();
	Ncl.bikeLoan();
	Ncl.homeLoan();
	Ncl.insurance();
	Ncl.hdfcbank();
	Ncl.sbibank();
	Ncl.icicibank();
	
}

@Override
public void insurance() {
System.out.println("insurance");	
}

@Override
public void hdfcbank() {

	System.out.println("hdfcbank");
}

@Override
public void sbibank() {

	System.out.println("sbibank");
}

@Override
public void icicibank() {

	System.out.println("icicibank");
}
}
