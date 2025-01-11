package git;

class Emplyoee{
	public void calsal(double salary) {
		System.out.println(salary);
	}
	
	public void calsal(double salary , double tax) {
		System.out.println(salary-tax);
		
	}
	
	public void calsal(double salary , double tax , double bonus) {
		System.out.println((salary-tax) + bonus);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Emplyoee e = new Emplyoee();
		e.calsal(50000);
		e.calsal(50000, 5000);
		e.calsal(50000, 5000, 2000);
		
	}

}





