package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the avisclient database table.
 * 
 */
@Entity
@NamedQuery(name="Avisclient.findAll", query="SELECT a FROM Avisclient a")
public class Avisclient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAvis;

	private String commentaire;

	private Timestamp date;

	private int idArticle;

	private int idClient;

	public Avisclient() {
	}

	public int getIdAvis() {
		return this.idAvis;
	}

	public void setIdAvis(int idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}