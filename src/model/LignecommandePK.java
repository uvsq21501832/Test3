package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the lignecommande database table.
 * 
 */
@Embeddable
public class LignecommandePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idArticle;

	private int idCommande;

	public LignecommandePK() {
	}
	public int getIdArticle() {
		return this.idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public int getIdCommande() {
		return this.idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LignecommandePK)) {
			return false;
		}
		LignecommandePK castOther = (LignecommandePK)other;
		return 
			(this.idArticle == castOther.idArticle)
			&& (this.idCommande == castOther.idCommande);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArticle;
		hash = hash * prime + this.idCommande;
		
		return hash;
	}
}