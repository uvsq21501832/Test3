package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categoriearticle database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriearticle.findAll", query="SELECT c FROM Categoriearticle c")
public class Categoriearticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategorie;

	private String description;

	private String nom;

	public Categoriearticle() {
	}

	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}