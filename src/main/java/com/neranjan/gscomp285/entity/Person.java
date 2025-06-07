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
@Table(name = "person")
@NamedQueries({ @NamedQuery(name = "Person.findAll", query = "SELECT b FROM Person b") })
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personAutoID")
    private Long personAutoID;
	
    private String firstName;
    private String middleName;
    private String lastName;
    
    @Column(unique = true)
    private String nic;
    @Column(unique = true)
    private String passport;
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personAutoID")
    private List<User> userAutoID;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personAutoID")
	private List<PersonContact> personContactAutoID;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personAutoID")
	private List<Bookings> bookingAutoID;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;

	public Long getPersonAutoID() {
		return personAutoID;
	}

	public void setPersonAutoID(Long personAutoID) {
		this.personAutoID = personAutoID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
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

	public List<User> getUserAutoID() {
		return userAutoID;
	}

	public void setUserAutoID(List<User> userAutoID) {
		this.userAutoID = userAutoID;
	}

	public List<PersonContact> getPersonContactAutoID() {
		return personContactAutoID;
	}

	public void setPersonContactAutoID(List<PersonContact> personContactAutoID) {
		this.personContactAutoID = personContactAutoID;
	}

	public Company getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}

	public List<Bookings> getBookingAutoID() {
		return bookingAutoID;
	}

	public void setBookingAutoID(List<Bookings> bookingAutoID) {
		this.bookingAutoID = bookingAutoID;
	}

	public Person(Long personAutoID, String firstName, String middleName, String lastName, String nic, String passport,
			Date createdAt, Date updatedAt, List<User> userAutoID, List<PersonContact> personContactAutoID,
			List<Bookings> bookingAutoID, Company companyAutoID) {
		super();
		this.personAutoID = personAutoID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.nic = nic;
		this.passport = passport;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userAutoID = userAutoID;
		this.personContactAutoID = personContactAutoID;
		this.bookingAutoID = bookingAutoID;
		this.companyAutoID = companyAutoID;
	}

	public Person() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingAutoID, companyAutoID, createdAt, firstName, lastName, middleName, nic, passport,
				personAutoID, personContactAutoID, updatedAt, userAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(bookingAutoID, other.bookingAutoID) && Objects.equals(companyAutoID, other.companyAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName)
				&& Objects.equals(nic, other.nic) && Objects.equals(passport, other.passport)
				&& Objects.equals(personAutoID, other.personAutoID)
				&& Objects.equals(personContactAutoID, other.personContactAutoID)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(userAutoID, other.userAutoID);
	}

	@Override
	public String toString() {
		return "Person [personAutoID=" + personAutoID + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", nic=" + nic + ", passport=" + passport + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", userAutoID=" + userAutoID + ", personContactAutoID="
				+ personContactAutoID + ", bookingAutoID=" + bookingAutoID + ", companyAutoID=" + companyAutoID + "]";
	}

	

	

	

	
    
    
}
