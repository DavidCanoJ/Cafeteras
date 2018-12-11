
public class Coche {

	private int combustible;
	private int consumoCada100Km;
	
	public int getCombustible() {
		return combustible;
	}
	
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	
	public int getConsumoCada100Km() {
		return consumoCada100Km;
	}
	
	public void setConsumoCada100Km(int consumoCada100Km) {
		this.consumoCada100Km = consumoCada100Km;
	}
	
	public double maximoKmARecorrer() {
		
		return (combustible / consumoCada100Km) * 100;
	}

	@Override
	public String toString() {
		return "Coche [combustible=" + combustible + ", consumoCada100Km=" + consumoCada100Km + "]";
	}

	
}
