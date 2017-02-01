package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the lignepanier database table.
 * 
 */
@Embeddable
public class LignepanierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idPanier;

	private int idArticle;

	public LignepanierPK() {
	}
	public int getIdPanier() {
		return this.idPanier;
	}
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public int getIdArticle() {
		return this.idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LignepanierPK)) {
			return false;
		}
		LignepanierPK castOther = (LignepanierPK)other;
		return 
			(this.idPanier == castOther.idPanier)
			&& (this.idArticle == castOther.idArticle);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPanier;
		hash = hash * prime + this.idArticle;
		
		return hash;
	}
}