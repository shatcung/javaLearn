package hw;
import java.util.Scanner;

public class simple_task {	
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);  // Create a Scanner object
	  
		System.out.println("Enter num A");	    
	    double a= num.nextDouble();
	    System.out.println("Enter num B");	    
	    double b= num.nextDouble();
	    System.out.println("Enter num C");	    
	    double c= num.nextDouble();
	    System.out.println("Enter num D");	    
	    double d= num.nextDouble();
	    
	    maxval(a, b, c, d);
	    
	
	}
	public static double maxval(double a, double b, double c, double d) {
		double min = a, max = a, kol = 0;

		if (min >= d) min = d;
		
		if (max <= b) {
			max = b;
			kol = kol + 1;
		}
		if (max <= c) {
			max = c;
			kol = kol + 1;
		}
		if (max <= d) {
			max = d;
			kol = kol + 1;
		}
		System.out.println("Количество максимальных чисел = " + kol);
	return kol;
}
}