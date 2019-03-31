import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el numero de empleados:");
		
		int veces = sc.nextInt();
		int entre = 0;
		int mas = 0;
		int total = 0;
		
		for(int n = 0; n < veces; n++ ) {
			
			System.out.println("Escibre el sueldo");
		
			int y = sc.nextInt();
			
			total += y;
			
			
			if(y >= 100 && y <= 300) {
				
				entre++;
			}
			else {
				
				mas++;				
			}
			
			}
		
		
		
		System.out.println("Sueldos entre $100 y $300 hay " + entre);
		
		System.out.println("Sueldos superiores a $300 hay " + mas);
		
		System.out.println("La empresa se gasta $" + total );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
