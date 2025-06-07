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
@Table(name = "airplanes_category")
@NamedQueries({ @NamedQuery(name = "AirplanesCategory.findAll", query = "SELECT b FROM AirplanesCategory b") })
public class AirplanesCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airplanesCategoryAutoID")
	private Long airplanesCategoryAutoID;
	
	@Column(unique = true)
	private String code;
	private String name;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "airplanesCategoryAutoID")
	private List<Airplanes> airplanesAutoID;

	public Long getAirplanesCategoryAutoID() {
		return airplanesCategoryAutoID;
	}

	public void setAirplanesCategoryAutoID(Long airplanesCategoryAutoID) {
		this.airplanesCategoryAutoID = airplanesCategoryAutoID;
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

	public List<Airplanes> getAirplanesAutoID() {
		return airplanesAutoID;
	}

	public void setAirplanesAutoID(List<Airplanes> airplanesAutoID) {
		this.airplanesAutoID = airplanesAutoID;
	}

	public AirplanesCategory(Long airplanesCategoryAutoID, String code, String name, Date createdAt, Date updatedAt,
			List<Airplanes> airplanesAutoID) {
		super();
		this.airplanesCategoryAutoID = airplanesCategoryAutoID;
		this.code = code;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.airplanesAutoID = airplanesAutoID;
	}

	public AirplanesCategory() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(airplanesAutoID, airplanesCategoryAutoID, code, createdAt, name, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirplanesCategory other = (AirplanesCategory) obj;
		return Objects.equals(airplanesAutoID, other.airplanesAutoID)
				&& Objects.equals(airplanesCategoryAutoID, other.airplanesCategoryAutoID)
				&& Objects.equals(code, other.code) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(name, other.name) && Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "AirplanesCategory [airplanesCategoryAutoID=" + airplanesCategoryAutoID + ", code=" + code + ", name="
				+ name + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", airplanesAutoID="
				+ airplanesAutoID + "]";
	}
	
	
	
	
}
