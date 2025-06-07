package com.neranjan.gscomp285.entity;

import java.math.BigDecimal;
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
@Table(name = "flights")
@NamedQueries({ @NamedQuery(name = "Flights.findAll", query = "SELECT b FROM Flights b") })
public class Flights {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flightsAutoID")
	private Long flightsAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "airplanesAutoID", referencedColumnName = "airplanesAutoID", nullable = false)
	private Airplanes airplanesAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "origin", referencedColumnName = "airportsAutoID", nullable = false)
	private Airports origin;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "destination", referencedColumnName = "airportsAutoID", nullable = false)
	private Airports destination;
	
	@Column(name = "departureTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureTime;
	
	@Column(name = "arrivalTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrivalTime;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	private BigDecimal price;
	
	@Column(name = "flights_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date flightsDate;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "flightsAutoID")
	private List<Seats> seatAutoID;

	public Long getFlightsAutoID() {
		return flightsAutoID;
	}

	public void setFlightsAutoID(Long flightsAutoID) {
		this.flightsAutoID = flightsAutoID;
	}

	public Airplanes getAirplanesAutoID() {
		return airplanesAutoID;
	}

	public void setAirplanesAutoID(Airplanes airplanesAutoID) {
		this.airplanesAutoID = airplanesAutoID;
	}

	public Airports getOrigin() {
		return origin;
	}

	public void setOrigin(Airports origin) {
		this.origin = origin;
	}

	public Airports getDestination() {
		return destination;
	}

	public void setDestination(Airports destination) {
		this.destination = destination;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
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

	public List<Seats> getSeatAutoID() {
		return seatAutoID;
	}

	public void setSeatAutoID(List<Seats> seatAutoID) {
		this.seatAutoID = seatAutoID;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getFlightsDate() {
		return flightsDate;
	}

	public void setFlightsDate(Date flightsDate) {
		this.flightsDate = flightsDate;
	}

	public Flights(Long flightsAutoID, Airplanes airplanesAutoID, Airports origin, Airports destination,
			Date departureTime, Date arrivalTime, Date createdAt, Date updatedAt, BigDecimal price, Date flightsDate,
			List<Seats> seatAutoID) {
		super();
		this.flightsAutoID = flightsAutoID;
		this.airplanesAutoID = airplanesAutoID;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.price = price;
		this.flightsDate = flightsDate;
		this.seatAutoID = seatAutoID;
	}

	public Flights() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(airplanesAutoID, arrivalTime, createdAt, departureTime, destination, flightsAutoID,
				flightsDate, origin, price, seatAutoID, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flights other = (Flights) obj;
		return Objects.equals(airplanesAutoID, other.airplanesAutoID) && Objects.equals(arrivalTime, other.arrivalTime)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightsAutoID, other.flightsAutoID)
				&& Objects.equals(flightsDate, other.flightsDate) && Objects.equals(origin, other.origin)
				&& Objects.equals(price, other.price) && Objects.equals(seatAutoID, other.seatAutoID)
				&& Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "Flights [flightsAutoID=" + flightsAutoID + ", airplanesAutoID=" + airplanesAutoID + ", origin=" + origin
				+ ", destination=" + destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", price=" + price + ", flightsDate="
				+ flightsDate + ", seatAutoID=" + seatAutoID + "]";
	}

	

	
	
	
}
