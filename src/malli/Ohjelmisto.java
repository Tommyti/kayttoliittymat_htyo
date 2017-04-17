// Tarpeellinen? Ks. Ohjelma-luokka. */
package malli;
import java.util.*;



public class Ohjelmisto {

	private List<Ohjelma> ohjelmat = new ArrayList<Ohjelma>();

	// CONSTRUCTOR
	public Ohjelmisto(){}
	
	
	// SETTERS
	/**
	 * @param ohjelmat the ohjelmat to set
	 */
	public void addOhjelma(Ohjelma ohj) {
		this.ohjelmat.add(ohj);
	}

	
	
	
	// GETTERS
	/**
	 * @return the ohjelmat
	 */
	public List<Ohjelma> getOhjelmat() {
		return ohjelmat;
	}
	
	
}
