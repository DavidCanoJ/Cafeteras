/**
 * 
 * @author David Cano
 *@version 1.0
 *
 */
public class Rectangulo {
	
// Atributos.
	
	private int lado;
	private int base;
	
// Constructoes.
	
/**
 * Constructor único para crear objeros de tipo Rectángulo.
 * @param base int relacionado con la base del rectángulo.
 * @param altura int relacionado con la altura del rectángulo.	
 */
public Rectangulo() {
	
	this.base = base;
	this.lado = lado;
}
/**
 * 
 * @return lado
 */

public int getLado() {
	return lado;
}
/**
 * 
 * @param lado
 */
public void setLado(int lado) {
	this.lado = lado;
}
/**
 * 
 * @return base
 */

public int getBase() {
	return base;
}
/**
 * 
 * @param base
 */

public void setBase(int base) {
	this.base = base;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Rectangulo [lado=" + lado + ", base=" + base + "]";
}




}
