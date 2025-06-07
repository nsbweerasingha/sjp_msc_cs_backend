package com.neranjan.gscomp285.entity;

import java.math.BigDecimal;
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
@Table(name = "bookings")
@NamedQueries({ @NamedQuery(name = "Bookings.findAll", query = "SELECT b FROM Bookings b") })
public class Bookings {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingAutoID")
	private Long bookingAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "flightsAutoID", referencedColumnName = "flightsAutoID", nullable = false)
	private Flights flightsAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "personAutoID", referencedColumnName = "personAutoID", nullable = false)
	private Person personAutoID;
	
	private String seatClass;
	
	private int seatNumber;
	
	private Date bookingDate;
	
	private BigDecimal paidAmount;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	public Long getBookingAutoID() {
		return bookingAutoID;
	}
	
	public void setBookingAutoID(Long bookingAutoID) {
		this.bookingAutoID = bookingAutoID;
	}
	
	public Flights getFlightsAutoID() {
		return flightsAutoID;
	}
	public void setFlightsAutoID(Flights flightsAutoID) {
		this.flightsAutoID = flightsAutoID;
	}
	
	public Person getPersonAutoID() {
		return personAutoID;
	}
	
	public void setPersonAutoID(Person personAutoID) {
		this.personAutoID = personAutoID;
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
	
	public Date getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
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

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Bookings(Long bookingAutoID, Flights flightsAutoID, Person personAutoID, String seatClass, int seatNumber,
			Date bookingDate, BigDecimal paidAmount, Date createdAt, Date updatedAt) {
		super();
		this.bookingAutoID = bookingAutoID;
		this.flightsAutoID = flightsAutoID;
		this.personAutoID = personAutoID;
		this.seatClass = seatClass;
		this.seatNumber = seatNumber;
		this.bookingDate = bookingDate;
		this.paidAmount = paidAmount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Bookings() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingAutoID, bookingDate, createdAt, flightsAutoID, paidAmount, personAutoID, seatClass,
				seatNumber, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookings other = (Bookings) obj;
		return Objects.equals(bookingAutoID, other.bookingAutoID) && Objects.equals(bookingDate, other.bookingDate)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(flightsAutoID, other.flightsAutoID)
				&& Objects.equals(paidAmount, other.paidAmount) && Objects.equals(personAutoID, other.personAutoID)
				&& Objects.equals(seatClass, other.seatClass) && seatNumber == other.seatNumber
				&& Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "Bookings [bookingAutoID=" + bookingAutoID + ", flightsAutoID=" + flightsAutoID + ", personAutoID="
				+ personAutoID + ", seatClass=" + seatClass + ", seatNumber=" + seatNumber + ", bookingDate="
				+ bookingDate + ", paidAmount=" + paidAmount + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
	
	
	
	
}
