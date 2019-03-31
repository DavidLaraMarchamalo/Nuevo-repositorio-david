import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el numero de clientes:");
		
		int veces = sc.nextInt();
		int total = 0;
		
		for(int n = 0; n < veces; n++ ) {
			
			System.out.println("Escribe el numero de cuenta:");
			
			int x = sc.nextInt();
			
			System.out.println("Escibre el saldo:");
		
			int y = sc.nextInt();
			
			
			
			
			if(y > 0) {
				
				System.out.println("Saldo acreedor");
				total += y;
			}
			else if( y == 0){
				
				System.out.println("Saldo nulo");		
			}
			else if(y < 0) {
				
				System.out.println("Saldo deudor");
			}
			
			}
		
		
		
		System.out.println("Total suma de los saldos acreedores " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
