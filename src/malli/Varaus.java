package malli;
import java.util.Date;

/** Luokka kuvaa varauksia. */

public class Varaus {
	private Teatteri teatteri;
	private Ohjelma ohjelma;
	private Sali sali;
	private int paikka;
	private Date pvm;
	private Date varauspvm;
	private Date lunastuspvm;
	private int id;
	

	
	public void teeVaraus(Teatteri t, Sali s, Ohjelma ohj, Date d, int p){
		//if paikkaVarattu(p) return false;
		this.teatteri = t;
		this.sali = s;
		this.ohjelma = ohj;
		this.paikka = p;
		this.pvm = d;
		//this.varauspvm; = //now();
		this.lunastuspvm = calcLunastuspvm(varauspvm);		
		
	};
	
	
	// CONSTRUCTOR
	
	public Varaus(int id){ this.id = id;}
	
	
	// SETTERS
	
	private Date calcLunastuspvm(Date vpvm){
		return null;
	}

	/**
	 * @return the ohjelma
	 */
	public Ohjelma getOhjelma() {
		return ohjelma;
	}

	/**
	 * @return the teatteri
	 */
	public Teatteri getTeatteri() {
		return teatteri;
	}

	/**
	 * @return the pvm
	 */
	public Date getPvm() {
		return pvm;
	}

	/**
	 * @return the varauspvm
	 */
	public Date getVarauspvm() {
		return varauspvm;
	}

	/**
	 * @return the lunastuspvm
	 */
	public Date getLunastuspvm() {
		return lunastuspvm;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param ohjelma the ohjelma to set
	 */
	public void setOhjelma(Ohjelma ohjelma) {
		this.ohjelma = ohjelma;
	}

	/**
	 * @param teatteri the teatteri to set
	 */
	public void setTeatteri(Teatteri teatteri) {
		this.teatteri = teatteri;
	}

	/**
	 * @param pvm the pvm to set
	 */
	public void setPvm(Date pvm) {
		this.pvm = pvm;
	}

	/**
	 * @param varauspvm the varauspvm to set
	 */
	public void setVarauspvm(Date varauspvm) {
		this.varauspvm = varauspvm;
	}

	/**
	 * @param lunastuspvm the lunastuspvm to set
	 */
	public void setLunastuspvm(Date lunastuspvm) {
		this.lunastuspvm = lunastuspvm;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	// GETTERS
	
	
}
