package examen;
import java.util.Scanner;

public class examen {

	public static void menu(){
		
		System.out.println("========================================");
		System.out.println(" 1. Calcular el área de un triángulo");
		System.out.println(" 2. Calcular el área de un trapecio");
		System.out.println(" 3. Calcular el área de un rectángulo");
		System.out.println(" 4. Salir ");
		
	}	
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
		menu();
		System.out.println("Elige una opción");
		int numero = sc.nextInt();
			
			switch (numero) {
			
				case 1: numero = 1;
				System.out.println("Dame la base");
				int ladob = sc.nextInt();
				System.out.println("Dame la altura");
				int ladoa = sc.nextInt();
				
				if(ladoa > 0 && ladob > 0) {
				
					int areaTriangulo = (ladob * ladoa)/2; 
					System.out.printf("%d", areaTriangulo);
					
				}else 
					System.out.println("Los valores introducidos no son válidos");
				break;
				
				
			}
		
		}
}		

