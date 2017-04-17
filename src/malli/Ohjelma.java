/** Luokka kuvaa ohjelmaa kuten yksitt�ist� leffaa. */
package malli;

import java.util.*;
import javax.swing.*;

public class Ohjelma {

	private String nimi;
	private int kesto;
	private ImageIcon kuvake;
	private String kuvaus;
	private int id;
	private List<Date> naytosajat = new ArrayList<Date>(); 
	private Teatteri teatteri;
	
	// CONSTRUCTOR
	public Ohjelma(int id){
		this.id = id;
	}

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
	 * @return the kesto
	 */
	public int getKesto() {
		return kesto;
	}

	/**
	 * @param kesto the kesto to set
	 */
	public void setKesto(int kesto) {
		this.kesto = kesto;
	}

	/**
	 * @return the kuvake
	 */
	public ImageIcon getKuvake() {
		return kuvake;
	}

	/**
	 * @param kuvake the kuvake to set
	 */
	public void setKuvake(ImageIcon kuvake) {
		this.kuvake = kuvake;
	}

	/**
	 * @return the kuvaus
	 */
	public String getKuvaus() {
		return kuvaus;
	}

	/**
	 * @param kuvaus the kuvaus to set
	 */
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the n�yt�sAjat
	 */
	public List<Date> getNaytosajat() {
		return naytosajat;
	}

	/**
	 * @param n�yt�sAjat the n�yt�sAjat to set
	 */
	public boolean addNaytosajat(Date naytosaika) {
		return this.naytosajat.add(naytosaika);
	}
	
	
	// SETTERS
	
	
	
	// GETTERS
	
	
}
