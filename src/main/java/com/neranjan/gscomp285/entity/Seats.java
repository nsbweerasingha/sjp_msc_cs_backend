package com.neranjan.gscomp285.entity;

import java.util.Date;
import java.util.Objects;

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
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "seats")
@NamedQueries({ @NamedQuery(name = "Seats.findAll", query = "SELECT b FROM Seats b") })
public class Seats {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seatAutoID")
	private Long seatAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "flightsAutoID", referencedColumnName = "flightsAutoID", nullable = false)
	private Flights flightsAutoID;
	
	private String seatClass;
	
	private int seatNumber;
	
	private int status;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	public Long getSeatAutoID() {
		return seatAutoID;
	}
	public void setSeatAutoID(Long seatAutoID) {
		this.seatAutoID = seatAutoID;
	}
	public Flights getFlightsAutoID() {
		return flightsAutoID;
	}
	public void setFlightsAutoID(Flights flightsAutoID) {
		this.flightsAutoID = flightsAutoID;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public Seats(Long seatAutoID, Flights flightsAutoID, String seatClass, int seatNumber, int status, Date createdAt,
			Date updatedAt) {
		super();
		this.seatAutoID = seatAutoID;
		this.flightsAutoID = flightsAutoID;
		this.seatClass = seatClass;
		this.seatNumber = seatNumber;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Seats() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdAt, flightsAutoID, seatAutoID, seatClass, seatNumber, status, updatedAt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seats other = (Seats) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(flightsAutoID, other.flightsAutoID)
				&& Objects.equals(seatAutoID, other.seatAutoID) && Objects.equals(seatClass, other.seatClass)
				&& seatNumber == other.seatNumber && status == other.status
				&& Objects.equals(updatedAt, other.updatedAt);
	}
	@Override
	public String toString() {
		return "Seats [seatAutoID=" + seatAutoID + ", flightsAutoID=" + flightsAutoID + ", seatClass=" + seatClass
				+ ", seatNumber=" + seatNumber + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	
	
}
