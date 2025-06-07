package com.neranjan.gscomp285.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "airplanes")
@NamedQueries({ @NamedQuery(name = "Airplanes.findAll", query = "SELECT b FROM Airplanes b") })
public class Airplanes {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airplanesAutoID")
	private Long airplanesAutoID;
	@Column(unique = true)
	private String code;
	private String model;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "airplanesCategoryAutoID", referencedColumnName = "airplanesCategoryAutoID", nullable = false)
	private AirplanesCategory airplanesCategoryAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "airplanesAutoID")
	private List<Flights> flightsAutoID;

	public Long getAirplanesAutoID() {
		return airplanesAutoID;
	}

	public void setAirplanesAutoID(Long airplanesAutoID) {
		this.airplanesAutoID = airplanesAutoID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public AirplanesCategory getAirplanesCategoryAutoID() {
		return airplanesCategoryAutoID;
	}

	public void setAirplanesCategoryAutoID(AirplanesCategory airplanesCategoryAutoID) {
		this.airplanesCategoryAutoID = airplanesCategoryAutoID;
	}

	public List<Flights> getFlightsAutoID() {
		return flightsAutoID;
	}

	public void setFlightsAutoID(List<Flights> flightsAutoID) {
		this.flightsAutoID = flightsAutoID;
	}

	public Airplanes(Long airplanesAutoID, String code, String model, Date createdAt, Date updatedAt,
			AirplanesCategory airplanesCategoryAutoID, List<Flights> flightsAutoID) {
		super();
		this.airplanesAutoID = airplanesAutoID;
		this.code = code;
		this.model = model;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.airplanesCategoryAutoID = airplanesCategoryAutoID;
		this.flightsAutoID = flightsAutoID;
	}

	public Airplanes() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(airplanesAutoID, airplanesCategoryAutoID, code, createdAt, flightsAutoID, model, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplanes other = (Airplanes) obj;
		return Objects.equals(airplanesAutoID, other.airplanesAutoID)
				&& Objects.equals(airplanesCategoryAutoID, other.airplanesCategoryAutoID)
				&& Objects.equals(code, other.code) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(flightsAutoID, other.flightsAutoID) && Objects.equals(model, other.model)
				&& Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "Airplanes [airplanesAutoID=" + airplanesAutoID + ", code=" + code + ", model=" + model + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", airplanesCategoryAutoID=" + airplanesCategoryAutoID
				+ ", flightsAutoID=" + flightsAutoID + "]";
	}
	
	
}
