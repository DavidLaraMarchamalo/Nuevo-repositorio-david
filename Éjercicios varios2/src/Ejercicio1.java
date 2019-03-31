import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pon un numero");
		
		double n = sc.nextInt();
		
		System.out.println("Pon otro numero");
		
		double y = sc.nextInt();
		
		
		
		if (n > y ) {
			double suma = n + y;
			double resta = n - y;
			System.out.println("suma " + suma + " resta " + resta);
		}
		else {
			double producto = y * n;
			double division = n / y;
			System.out.println("producto " + producto + " division " + division);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
