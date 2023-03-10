package com;
// Generated 5 f�vr. 2023, 22:53:46 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservation generated by hbm2java
 */
@Entity
@Table(name = "reservation", catalog = "myregister")
public class Reservation implements java.io.Serializable {

	private Integer idReservation;
	private int idClient;
	private int idMateriel;
	private Date dateDebutReservation;
	private Date dateFinReservation;
	private Integer quantiteReservee;

	public Reservation() {
	}

	public Reservation(int idClient, int idMateriel) {
		this.idClient = idClient;
		this.idMateriel = idMateriel;
	}

	public Reservation(int idClient, int idMateriel, Date dateDebutReservation, Date dateFinReservation,
			Integer quantiteReservee) {
		this.idClient = idClient;
		this.idMateriel = idMateriel;
		this.dateDebutReservation = dateDebutReservation;
		this.dateFinReservation = dateFinReservation;
		this.quantiteReservee = quantiteReservee;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_RESERVATION", unique = true, nullable = false)
	public Integer getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	@Column(name = "ID_CLIENT", nullable = false)
	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Column(name = "ID_MATERIEL", nullable = false)
	public int getIdMateriel() {
		return this.idMateriel;
	}

	public void setIdMateriel(int idMateriel) {
		this.idMateriel = idMateriel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEBUT_RESERVATION", length = 19)
	public Date getDateDebutReservation() {
		return this.dateDebutReservation;
	}

	public void setDateDebutReservation(Date dateDebutReservation) {
		this.dateDebutReservation = dateDebutReservation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_FIN_RESERVATION", length = 19)
	public Date getDateFinReservation() {
		return this.dateFinReservation;
	}

	public void setDateFinReservation(Date dateFinReservation) {
		this.dateFinReservation = dateFinReservation;
	}

	@Column(name = "QUANTITE_RESERVEE")
	public Integer getQuantiteReservee() {
		return this.quantiteReservee;
	}

	public void setQuantiteReservee(Integer quantiteReservee) {
		this.quantiteReservee = quantiteReservee;
	}

}
