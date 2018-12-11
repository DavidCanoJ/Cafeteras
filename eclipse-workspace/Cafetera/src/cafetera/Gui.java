package cafetera;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cafetera maquina = new Cafetera(10, 5);
		System.out.println(maquina.devCafetera());
		System.out.println(maquina);
		maquina.setVasos(15);
		System.out.println(maquina.getVasos());
	}
	

}
