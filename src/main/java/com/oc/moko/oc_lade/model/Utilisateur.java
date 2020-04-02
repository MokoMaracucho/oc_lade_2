package com.oc.moko.oc_lade.model;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_utilisateur")
	private UUID idUtilisateur;
	@NotBlank
	@Column(name="prenom_utilisateur")
	private String prenomUtilisateur;
	@NotBlank
	@Column(name="nom_utilisateur")
	private String nomUtilisateur;
	@NotBlank
	@Column(name="email_utilisateur")
	private String emailUtilisateur;
	@NotBlank
	@Column(name="mot_de_passe_utilisateur")
	private String motDePasseUtilisateur;
	@NotBlank
	@Column(name="privilege_utilisateur")
	private Privilege privilegeUtilisateur;
	@NotBlank
	@Column(name="date_inscription_utilisateur")
	private Timestamp dateInscriptionUtilisateur;
	
	protected Utilisateur(	
		UUID idUtilisateur, 
		String prenomUtilisateur, 
		String nomUtilisateur, 
		String emailUtilisateur,
		String motDePasseUtilisateur, 
		Privilege privilege_utilisateur, 
		Timestamp dateInscriptionUtilisateur
	) {
		this.idUtilisateur = idUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.motDePasseUtilisateur = motDePasseUtilisateur;
		this.privilegeUtilisateur = privilege_utilisateur;
		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
	}

	public UUID getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(UUID idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getMotDePasseUtilisateur() {
		return motDePasseUtilisateur;
	}

	public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
		this.motDePasseUtilisateur = motDePasseUtilisateur;
	}

	public Privilege getPrivilegeUtilisateur() {
		return privilegeUtilisateur;
	}

	public void setPrivilegeUtilisateur(Privilege privilegeUtilisateur) {
		this.privilegeUtilisateur = privilegeUtilisateur;
	}

	public Timestamp getDateInscriptionUtilisateur() {
		return dateInscriptionUtilisateur;
	}

	public void setDateInscriptionUtilisateur(Timestamp dateInscriptionUtilisateur) {
		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
	}
}
