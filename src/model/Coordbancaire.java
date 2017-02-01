package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the coordbancaires database table.
 * 
 */
@Entity
@Table(name="coordbancaires")
@NamedQuery(name="Coordbancaire.findAll", query="SELECT c FROM Coordbancaire c")
public class Coordbancaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String numeroCarte;

	private String cryptogramme;

	private int idClient;

	public Coordbancaire() {
	}

	public String getNumeroCarte() {
		return this.numeroCarte;
	}

	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public String getCryptogramme() {
		return this.cryptogramme;
	}

	public void setCryptogramme(String cryptogramme) {
		this.cryptogramme = cryptogramme;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}