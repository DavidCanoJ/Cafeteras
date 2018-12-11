package cafetera;

public class Cafetera {
	
	private int vasos;
	private float nivel_agua;
	//float consumibles[][];
	

	public Cafetera() {
		
		vasos = 0;
		nivel_agua = 0;
	}
	
	public int getVasos() {
		return vasos;
	}

	public void setVasos(int vasos) {
		this.vasos = vasos;
	}

	public float getNivel_agua() {
		return nivel_agua;
	}

	public void setNivel_agua(float nivel_agua) {
		this.nivel_agua = nivel_agua;
	}

	public Cafetera(int vasos, float nivel_agua) {
		this.vasos = vasos;
		this.nivel_agua = nivel_agua;
	}
	
	public String devCafetera() {
		String aux = "Numero de vasos ?=" + vasos;
		aux+=" Y Nivel de agua =" +nivel_agua;
		return aux;
	}
	
	public String toString() {
		String aux = "Numero de vasos ?= " + vasos;
		aux+=" Y Nivel de agua = " +nivel_agua;
		return aux;
	}
	
	

}
