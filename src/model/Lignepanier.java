package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lignepanier database table.
 * 
 */
@Entity
@NamedQuery(name="Lignepanier.findAll", query="SELECT l FROM Lignepanier l")
public class Lignepanier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LignepanierPK id;

	public Lignepanier() {
	}

	public LignepanierPK getId() {
		return this.id;
	}

	public void setId(LignepanierPK id) {
		this.id = id;
	}

}