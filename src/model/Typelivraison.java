package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the typelivraison database table.
 * 
 */
@Entity
@NamedQuery(name="Typelivraison.findAll", query="SELECT t FROM Typelivraison t")
public class Typelivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idType;

	private int frais;

	private String nom;

	public Typelivraison() {
	}

	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public int getFrais() {
		return this.frais;
	}

	public void setFrais(int frais) {
		this.frais = frais;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}