import java.util.Scanner;
public class investment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How much did you invest?");
		double investment = sc.nextDouble();
		System.out.println("How much interest?");
		double interest = sc.nextDouble();
		
	for(int year=0; year <= 30; year++){
		System.out.println("year "+ year);
		double newInvestment = (interest/100)*investment + investment;
		 investment = newInvestment;
		
		System.out.println(  newInvestment);
		
	}
		

	}

}
