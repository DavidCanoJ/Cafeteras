import java.util.Scanner;


public class TestUsuario {

	public static void main(String[] args) {
		
		System.out.println("Introduce login y password (nº entre 0 y 9)");
		
		Scanner sc = new Scanner(System.in);
		String login = sc.next();
		Usuario  usuario = new Usuario(login);
		int password = sc.nextInt();
		sc.close();
		if (usuario.getPassword() == password) {
			
			System.out.println("Has acertado");
			System.out.println(usuario);
		}
		else {
			System.out.println("No has acertado");
			System.out.println(usuario);
			
		}
	}

}
