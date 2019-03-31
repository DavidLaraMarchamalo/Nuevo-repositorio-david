import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		
		Scanner sc = new Scanner(System.in);
		
		int digitos = 0;
		int n = 0;
	
			System.out.println("Introduce un numero");
			n = sc.nextInt(); 
		
		
		if ( n >= 0 && n < 1000) {
			
			do {
			n /= 10;
			digitos++;}
		
			while (n != 0);
			
			System.out.println(digitos + " digitos");}
		
		else {
		
		System.out.println("Numero erroneo");}}}
	