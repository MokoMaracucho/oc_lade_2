package com.oc.moko.oc_lade.model;

import java.sql.Timestamp;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Utilisateur {
	
	private UUID idUtilisateur;
	private String prenomUtilisateur;
	private String nomUtilisateur;
	private String emailUtilisateur;
	private String motDePasseUtilisateur;
	private Privilege privilegeUtilisateur;
	private Timestamp dateInscriptionUtilisateur;
	
	public Utilisateur(	
		@JsonProperty("idUtilisateur") UUID idUtilisateur, 
		@JsonProperty("prenomUtilisateur") String prenomUtilisateur, 
		@JsonProperty("nomUtilisateur") String nomUtilisateur, 
		@JsonProperty("emailUtilisateur") String emailUtilisateur,
		@JsonProperty("motDePasseUtilisateur") String motDePasseUtilisateur, 
		@JsonProperty("privilegeUtilisateur") Privilege privilege_utilisateur, 
		@JsonProperty("dateInscriptionUtilisateur") Timestamp dateInscriptionUtilisateur
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
