
public class TestCoche {

	public static void main(String[] args) {
		
		Coche Coche1 = new Coche();
		
		Coche1.setCombustible(5);
		Coche1.setConsumoCada100Km(7);
		Coche1.maximoKmARecorrer();
		System.out.printf("El máximo de Km que puedes recorrer es,%f", Coche1.maximoKmARecorrer());
	}
	
}
