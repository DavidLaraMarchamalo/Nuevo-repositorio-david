import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pon un lado");
		
		int n1 = sc.nextInt();
		
		System.out.println("Pon otro lado");
		
		int n2 = sc.nextInt();
		
		System.out.println("Pon otro lado");
		
		int n3 = sc.nextInt();
		
		if( n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("Es un triangulo equilatero");
		}else if( n1==n2 || n1==n3 || n2 == n3) {
			System.out.println("Es un triangulo isoceles");
		} else {
			System.out.println("Es un triangulo escaleno");
		}
		
		
		
	}

}
