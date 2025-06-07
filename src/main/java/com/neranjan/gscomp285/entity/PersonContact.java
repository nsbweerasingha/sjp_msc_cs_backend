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
@Table(name = "person_contact")
@NamedQueries({ @NamedQuery(name = "PersonContact.findAll", query = "SELECT b FROM PersonContact b") })
public class PersonContact {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personContactAutoID")
    private Long personContactAutoID;
	
    private String value;
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "personAutoID",referencedColumnName = "personAutoID", nullable = false)  // foreign key column
    private Person personAutoID;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "contactTypeAutoID",referencedColumnName = "contactTypeAutoID", nullable = false)  // foreign key column
    private MstContactType contactTypeAutoID;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;

	public Long getPersonContactAutoID() {
		return personContactAutoID;
	}

	public void setPersonContactAutoID(Long personContactAutoID) {
		this.personContactAutoID = personContactAutoID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public Person getPersonAutoID() {
		return personAutoID;
	}

	public void setPersonAutoID(Person personAutoID) {
		this.personAutoID = personAutoID;
	}

	public MstContactType getContactTypeAutoID() {
		return contactTypeAutoID;
	}

	public void setContactTypeAutoID(MstContactType contactTypeAutoID) {
		this.contactTypeAutoID = contactTypeAutoID;
	}

	public Company getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}

	public PersonContact(Long personContactAutoID, String value, Date createdAt, Date updatedAt, Person personAutoID,
			MstContactType contactTypeAutoID, Company companyAutoID) {
		super();
		this.personContactAutoID = personContactAutoID;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.personAutoID = personAutoID;
		this.contactTypeAutoID = contactTypeAutoID;
		this.companyAutoID = companyAutoID;
	}

	public PersonContact() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyAutoID, contactTypeAutoID, createdAt, personAutoID, personContactAutoID, updatedAt,
				value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonContact other = (PersonContact) obj;
		return Objects.equals(companyAutoID, other.companyAutoID)
				&& Objects.equals(contactTypeAutoID, other.contactTypeAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(personAutoID, other.personAutoID)
				&& Objects.equals(personContactAutoID, other.personContactAutoID)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "PersonContact [personContactAutoID=" + personContactAutoID + ", value=" + value + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", personAutoID=" + personAutoID + ", contactTypeAutoID="
				+ contactTypeAutoID + ", companyAutoID=" + companyAutoID + "]";
	}

	

	
}
