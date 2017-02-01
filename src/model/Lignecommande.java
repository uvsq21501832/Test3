package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lignecommande database table.
 * 
 */
@Entity
@NamedQuery(name="Lignecommande.findAll", query="SELECT l FROM Lignecommande l")
public class Lignecommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LignecommandePK id;

	public Lignecommande() {
	}

	public LignecommandePK getId() {
		return this.id;
	}

	public void setId(LignecommandePK id) {
		this.id = id;
	}

}