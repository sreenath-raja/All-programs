package first_module;

public class NormalClass extends Abstraction1{

	@Override
	public void homeLoan() {
		System.out.println("Home Loan");
	}

	@Override
	public void educationalLoan() {
		System.out.println("Educational Loan");
		
	}
public static void main(String[] args) {
	NormalClass NC= new NormalClass();
	NC.homeLoan();
	NC.personalLoan();
	NC.educationalLoan();
	
}
	
}
