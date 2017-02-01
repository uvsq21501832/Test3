package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the livraison database table.
 * 
 */
@Entity
@NamedQuery(name="Livraison.findAll", query="SELECT l FROM Livraison l")
public class Livraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLivraison;

	private Timestamp datePrevu;

	private String etatLivraison;

	private int idAdresse;

	private int idType;

	public Livraison() {
	}

	public int getIdLivraison() {
		return this.idLivraison;
	}

	public void setIdLivraison(int idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Timestamp getDatePrevu() {
		return this.datePrevu;
	}

	public void setDatePrevu(Timestamp datePrevu) {
		this.datePrevu = datePrevu;
	}

	public String getEtatLivraison() {
		return this.etatLivraison;
	}

	public void setEtatLivraison(String etatLivraison) {
		this.etatLivraison = etatLivraison;
	}

	public int getIdAdresse() {
		return this.idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

}