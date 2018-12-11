package Cafetera1;

import java.util.Arrays;

public class Cafetera {
		
		private int vasos;
		private float nivel_agua;
		private float consumibles [][]; //[nombre],[número_capsula], [agua], [temperatura],[tiempo];  
		private int max_consumibles;
		
		public Cafetera(int vasos, float nivel_agua, float[][] consumibles, int max_consumibles) {
			
			this.vasos = vasos;
			this.nivel_agua = nivel_agua;
			this.consumibles = consumibles;
			this.max_consumibles = max_consumibles;
		}
		
		public void recargaCafeteraInicial(float recarga [][]) {
			
			for (int i = 0; i < max_consumibles; i++) 
				for (int j = 0; j < 4; j++)
					consumibles[i][j] = recarga [i][j];	
		}
		
		//Método que carga inicialmente la máquina.
		
		public static float [][] pruebaRecarga(){
			
			float recarga[][] = new float [5][4];
				
			//cápsulas
				for (int i = 0; i < 5; i++)	
					recarga [i][0]= 1;
			//agua por cápsula	
				recarga[0][1] = 0.25f;
				recarga[1][1] = 0.25f;
				recarga[2][1] = 0.20f;
				recarga[3][1] = 0.20f;
				recarga[4][1] = 0.15f;
			//temperatura
				recarga[0][2] = 0.65f;
				recarga[1][2] = 0.65f;
				recarga[2][2] = 0.60f;
				recarga[3][2] = 0.60f;
				recarga[4][2] = 0.55f;
			//tiempo	
				recarga[0][3] = 10f;
				recarga[1][3] = 10f;
				recarga[2][3] = 12f;
				recarga[3][3] = 12f;
				recarga[4][3] = 14f;
				
		return recarga;	
		
		
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

		public float[][] getConsumibles() {
			return consumibles;
		}

		public void setConsumibles(float[][] consumibles) {
			this.consumibles = consumibles;
		}

		public int getMax_consumibles() {
			return max_consumibles;
		}

		public void setMax_consumibles(int max_consumibles) {
			this.max_consumibles = max_consumibles;
		}

		@Override
		public String toString() {
			return "Cafetera [Cantidad de vasos=" + vasos + ", El nivel de agua es =" + nivel_agua + ", consumibles="
					+ Arrays.toString(consumibles) + ", max_consumibles=" + max_consumibles + ", getVasos()="
					+ getVasos() + ", getNivel_agua()=" + getNivel_agua() + ", getConsumibles()="
					+ Arrays.toString(getConsumibles()) + ", getMax_consumibles()=" + getMax_consumibles()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	
		
		
}
