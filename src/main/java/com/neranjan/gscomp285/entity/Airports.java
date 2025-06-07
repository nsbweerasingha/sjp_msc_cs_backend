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
@Table(name = "airports")
@NamedQueries({ @NamedQuery(name = "Airports.findAll", query = "SELECT b FROM Airports b") })
public class Airports {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airportsAutoID")
	private Long airportsAutoID;
	
	@Column(unique = true)
	private String code;
	private String name;
	private String city;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "countryAutoID", referencedColumnName = "countryAutoID", nullable = false)
	private MstCountry countryAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "origin")
	private List<Flights> flightsAutoID;

	public Long getAirportsAutoID() {
		return airportsAutoID;
	}

	public void setAirportsAutoID(Long airportsAutoID) {
		this.airportsAutoID = airportsAutoID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public MstCountry getCountryAutoID() {
		return countryAutoID;
	}

	public void setCountryAutoID(MstCountry countryAutoID) {
		this.countryAutoID = countryAutoID;
	}

	public List<Flights> getFlightsAutoID() {
		return flightsAutoID;
	}

	public void setFlightsAutoID(List<Flights> flightsAutoID) {
		this.flightsAutoID = flightsAutoID;
	}

	public Airports(Long airportsAutoID, String code, String name, String city, Date createdAt, Date updatedAt,
			MstCountry countryAutoID, List<Flights> flightsAutoID) {
		super();
		this.airportsAutoID = airportsAutoID;
		this.code = code;
		this.name = name;
		this.city = city;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.countryAutoID = countryAutoID;
		this.flightsAutoID = flightsAutoID;
	}

	public Airports() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(airportsAutoID, city, code, countryAutoID, createdAt, flightsAutoID, name, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airports other = (Airports) obj;
		return Objects.equals(airportsAutoID, other.airportsAutoID) && Objects.equals(city, other.city)
				&& Objects.equals(code, other.code) && Objects.equals(countryAutoID, other.countryAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(flightsAutoID, other.flightsAutoID)
				&& Objects.equals(name, other.name) && Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "Airports [airportsAutoID=" + airportsAutoID + ", code=" + code + ", name=" + name + ", city=" + city
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", countryAutoID=" + countryAutoID
				+ ", flightsAutoID=" + flightsAutoID + "]";
	}

	
	
	
}
