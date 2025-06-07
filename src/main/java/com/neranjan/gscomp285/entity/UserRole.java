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
@Table(name = "user_role")
@NamedQueries({ @NamedQuery(name = "UserRole.findAll", query = "SELECT b FROM UserRole b") })
public class UserRole {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userRoleAutoID")
    private Long userRoleAutoID;
	@Column(unique = true)
    private String code;
    private String name;
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userRoleAutoID")
	private List<User> userAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;

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

	public List<User> getUserAutoID() {
		return userAutoID;
	}

	public void setUserAutoID(List<User> userAutoID) {
		this.userAutoID = userAutoID;
	}

	public Long getUserRoleAutoID() {
		return userRoleAutoID;
	}

	public void setUserRoleAutoID(Long userRoleAutoID) {
		this.userRoleAutoID = userRoleAutoID;
	}

	public Company getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}

	public UserRole(Long userRoleAutoID, String code, String name, Date createdAt, Date updatedAt,
			List<User> userAutoID, Company companyAutoID) {
		super();
		this.userRoleAutoID = userRoleAutoID;
		this.code = code;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userAutoID = userAutoID;
		this.companyAutoID = companyAutoID;
	}

	public UserRole() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, companyAutoID, createdAt, name, updatedAt, userAutoID, userRoleAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRole other = (UserRole) obj;
		return Objects.equals(code, other.code) && Objects.equals(companyAutoID, other.companyAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(name, other.name)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(userAutoID, other.userAutoID)
				&& Objects.equals(userRoleAutoID, other.userRoleAutoID);
	}

	@Override
	public String toString() {
		return "UserRole [userRoleAutoID=" + userRoleAutoID + ", code=" + code + ", name=" + name + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", userAutoID=" + userAutoID + ", companyAutoID="
				+ companyAutoID + "]";
	}
	
	
}
