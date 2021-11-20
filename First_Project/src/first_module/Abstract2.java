package first_module;

public class Abstract2 extends Abstract{
public void ChennaiSkills() {
	System.out.println("the chennai skills");
	
}
public void Location1() {
	System.out.println("Its located in T-nagar");
	
}
public static void main(String[] args) {
	Abstract2 S = new Abstract2();
	S.ChennaiSkills();
	S.Location1();
	S.Shops();
	S.Location();
	S.Materials();
	S.Beds();
	S.DiningTables();
	S.Pillows();
}
@Override
public void Beds() {
	// TODO Auto-generated method stub
	
}
@Override
public void DiningTables() {
	// TODO Auto-generated method stub
	
}
@Override
public void Pillows() {
	// TODO Auto-generated method stub
	
}

}
