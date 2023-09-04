package packagejava;
import java.util.Scanner; // importing library scanner

public class JavaCode {
	
	public static void main(String[] args) {	
		Scanner read = new Scanner (System.in); // creating a scanner object
		double fahrenheit, celsius;
		
		System.out.printf("Insert a temperature in fahrenheit: ");
		fahrenheit = read.nextDouble(); // scanning a double variable
										// nextLine(), (char)System.in.read()
		read.close(); // closing the scanner object

		celsius = ((fahrenheit-32)*5.0/9.0);
		System.out.printf("The temperature in celsius is: %.2f\n", celsius);
	}
}