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
@Table(name = "mst_contact_type")
@NamedQueries({ @NamedQuery(name = "MstContactType.findAll", query = "SELECT b FROM MstContactType b") })
public class MstContactType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contactTypeAutoID")
    private Long contactTypeAutoID;
	@Column(unique = true)
    private String code;
    private String name;
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactTypeAutoID")
	private List<PersonContact> personContactAutoID;

	public Long getContactTypeAutoID() {
		return contactTypeAutoID;
	}

	public void setContactTypeAutoID(Long contactTypeAutoID) {
		this.contactTypeAutoID = contactTypeAutoID;
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

	public List<PersonContact> getPersonContactAutoID() {
		return personContactAutoID;
	}

	public void setPersonContactAutoID(List<PersonContact> personContactAutoID) {
		this.personContactAutoID = personContactAutoID;
	}

	public MstContactType(Long contactTypeAutoID, String code, String name, Date createdAt, Date updatedAt,
			List<PersonContact> personContactAutoID) {
		super();
		this.contactTypeAutoID = contactTypeAutoID;
		this.code = code;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.personContactAutoID = personContactAutoID;
	}

	public MstContactType() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, contactTypeAutoID, createdAt, name, personContactAutoID, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MstContactType other = (MstContactType) obj;
		return Objects.equals(code, other.code) && Objects.equals(contactTypeAutoID, other.contactTypeAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(name, other.name)
				&& Objects.equals(personContactAutoID, other.personContactAutoID)
				&& Objects.equals(updatedAt, other.updatedAt);
	}

	@Override
	public String toString() {
		return "MstContactType [contactTypeAutoID=" + contactTypeAutoID + ", code=" + code + ", name=" + name
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", personContactAutoID="
				+ personContactAutoID + "]";
	}

	
    
    
}
