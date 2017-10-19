import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.canMove();
		Oviparous o = new Oviparous();
		o.canMove();
		
		Scanner input = new Scanner(System.in);
		
	    try {
	    	
	    	System.out.println("Enter first value");
	    	int a = input.nextInt();
	    	System.out.println("Enter second value");
	    	int b = input.nextInt();
	    	int s=a/b;
	    	System.out.println("division ans");
	    	System.out.println(s);
	    	System.out.println("good job");
	        
	    }
	    catch(Exception e) {
	          
	    	System.out.println("It's impossible");
	          
	    }
	
	}
	
}