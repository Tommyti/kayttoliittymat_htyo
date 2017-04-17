/** Luokka kuvaa teatteria. */
package malli;
import java.util.*;
public class Teatteri {
	
	private String nimi;
	private String osoite;
	private List<Sali> salit = new ArrayList<Sali>();
	private Ohjelmisto ohjelmisto;
	
	// CONSTRUCTOR
	public Teatteri(String n, String o) {
		this.nimi = n;
		this.osoite = o;
	}
	
	
	// SETTERS
	
	
	
	// GETTERS
	
	
	/**
	 * @return the nimi
	 */
	public String getNimi() {
		return nimi;
	}
	/**
	 * @param nimi the nimi to set
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	/**
	 * @return the osoite
	 */
	public String getOsoite() {
		return osoite;
	}
	/**
	 * @param osoite the osoite to set
	 */
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	/**
	 * @return the salit
	 */
	public List<Sali> getSalit() {
		return salit;
	}
	
	
	/**
	 * @param salit the salit to set
	 */
	public boolean addSali(Sali sali) {
		return this.salit.add(sali);
	}
	
	
	/**
	 * @return the ohjelmisto
	 */
	public Ohjelmisto getOhjelmisto() {
		return ohjelmisto;
	}
	
	
	/**
	 * @param ohjelmisto the ohjelmisto to set
	 */
	public void setOhjelmisto(Ohjelmisto ohjelmisto) {
		this.ohjelmisto = ohjelmisto;
	}
	
	
	
}
