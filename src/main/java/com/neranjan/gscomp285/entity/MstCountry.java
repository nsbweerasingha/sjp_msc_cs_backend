package com.neranjan.gscomp285.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mst_country")
@NamedQueries({ @NamedQuery(name = "MstCountry.findAll", query = "SELECT b FROM MstCountry b") })
public class MstCountry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "countryAutoID")
	private Long countryAutoID;
	
	@Column(unique = true)
	private String countryShortCode;
	
	private String CountryDes;
	private String nationality;
	private String countryCode;
	private String countryTimeZone;
	
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "countryAutoID")
	private List<Airports> airportsAutoID;

	public Long getCountryAutoID() {
		return countryAutoID;
	}

	public void setCountryAutoID(Long countryAutoID) {
		this.countryAutoID = countryAutoID;
	}

	public String getCountryShortCode() {
		return countryShortCode;
	}

	public void setCountryShortCode(String countryShortCode) {
		this.countryShortCode = countryShortCode;
	}

	public String getCountryDes() {
		return CountryDes;
	}

	public void setCountryDes(String countryDes) {
		CountryDes = countryDes;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryTimeZone() {
		return countryTimeZone;
	}

	public void setCountryTimeZone(String countryTimeZone) {
		this.countryTimeZone = countryTimeZone;
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

	public List<Airports> getAirportsAutoID() {
		return airportsAutoID;
	}

	public void setAirportsAutoID(List<Airports> airportsAutoID) {
		this.airportsAutoID = airportsAutoID;
	}

	public MstCountry(Long countryAutoID, String countryShortCode, String countryDes, String nationality,
			String countryCode, String countryTimeZone, Date createdAt, Date updatedAt,
			List<Airports> airportsAutoID) {
		super();
		this.countryAutoID = countryAutoID;
		this.countryShortCode = countryShortCode;
		CountryDes = countryDes;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.countryTimeZone = countryTimeZone;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.airportsAutoID = airportsAutoID;
	}

	public MstCountry() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(CountryDes, airportsAutoID, countryAutoID, countryCode, countryShortCode, countryTimeZone,
				createdAt, nationality, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MstCountry other = (MstCountry) obj;
		return Objects.equals(CountryDes, other.CountryDes) && Objects.equals(airportsAutoID, other.airportsAutoID)
				&& Objects.equals(countryAutoID, other.countryAutoID) && Objects.equals(countryCode, other.countryCode)
				&& Objects.equals(countryShortCode, other.countryShortCode)
				&& Objects.equals(countryTimeZone, other.countryTimeZone) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(nationality, other.nationality) && Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "MstCountry [countryAutoID=" + countryAutoID + ", countryShortCode=" + countryShortCode + ", CountryDes="
				+ CountryDes + ", nationality=" + nationality + ", countryCode=" + countryCode + ", countryTimeZone="
				+ countryTimeZone + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", airportsAutoID="
				+ airportsAutoID + "]";
	}
	
	
}
