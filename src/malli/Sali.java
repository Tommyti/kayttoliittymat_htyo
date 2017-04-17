/** Luokka kuvaa salia. */
package malli;
import java.util.*;

class Sali {
	
	private int numero;
	private int koko;
	private ArrayList<Boolean> istumaPaikat = new ArrayList<Boolean>();
	
	
	
	// CONSTRUCTOR
	public Sali(int n, int k) {
		numero = n;
		koko = k;
		alustaPaikat();
	}
	
	
	
	// SETTERS

	
	/**
	 * Alustaa istumapaikat.
	 */
		
	private void alustaPaikat() {
		for (int i=0; i<getKoko(); i++){ istumaPaikat.add(false); }
	}// alustaPaikat()
	
	
	/**
	 * Yritt�� asettaa istumaPaikat-listan p.nnelle alkiolle arvoksi true.
	 * Palauttaa true jos onnistuu muuten false.
	 * @.pre (istumaPaikat != null) && (p < istumaPaikat.size())
	 * @.post istumaPaikat.get(p) == true
	 * @param p
	 * @return t/f
	 */
	public Boolean varaaPaikka(int p) { 
		return (istumaPaikat.get(p) == true)? false : istumaPaikat.set(p, true);
	}// varaaPaikka()
	
	
	
	// GETTERS
	
	public int getKoko() { return this.koko;}
	public int getNumero() { return this.numero; }
	public ArrayList<Boolean> getPaikkaStatus() { return this.istumaPaikat;}
	
}// class