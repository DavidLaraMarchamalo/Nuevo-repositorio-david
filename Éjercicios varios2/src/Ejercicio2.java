import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner sc = new Scanner(System.in);
			
			int digitos = 0;
			int n = 0;
			boolean nvalido = false;
			while(nvalido == false){
				System.out.println("Introduce un numero");
				n = sc.nextInt();
				if(n <= 0 || n > 99 )
					System.out.println("Numero no valido");
				else
					nvalido = true;}
			
			
			
			do {
				n /= 10;
				digitos++;}
			
			while (n != 0);
				
				
			System.out.println(digitos + " digitos");
			
		
		
		
	}}
