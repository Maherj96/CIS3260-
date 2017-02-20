import java.util.Scanner;


public class reverse {
	
	
	public static void main(String[] args) {
		int x, reverse = 0;
		 
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	 
	      while( x != 0 )
	      {
	    	  
	          reverse = reverse * 10;
	          reverse = reverse + x%10;
	          x = x/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
		
		
	}
	
	
		
		
		
	}


