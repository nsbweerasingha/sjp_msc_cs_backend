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
@Table(name = "user_permissions")
@NamedQueries({ @NamedQuery(name = "UserPermissions.findAll", query = "SELECT b FROM UserPermissions b") })
public class UserPermissions {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userPermissionsAutoID")
    private Long userPermissionsAutoID;
	@Column(unique = true)
    private String permissions;
    private String name;
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userNavigationAccessAutoID", referencedColumnName = "userNavigationAccessAutoID", nullable = false)
    private UserNavigationAccess userNavigationAccessAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;

	public Long getUserPermissionsAutoID() {
		return userPermissionsAutoID;
	}

	public void setUserPermissionsAutoID(Long userPermissionsAutoID) {
		this.userPermissionsAutoID = userPermissionsAutoID;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
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

	public UserNavigationAccess getUserNavigationAccessAutoID() {
		return userNavigationAccessAutoID;
	}

	public void setUserNavigationAccessAutoID(UserNavigationAccess userNavigationAccessAutoID) {
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
	}

	public Company getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}

	public UserPermissions(Long userPermissionsAutoID, String permissions, String name, Date createdAt, Date updatedAt,
			UserNavigationAccess userNavigationAccessAutoID, Company companyAutoID) {
		super();
		this.userPermissionsAutoID = userPermissionsAutoID;
		this.permissions = permissions;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
		this.companyAutoID = companyAutoID;
	}

	public UserPermissions() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyAutoID, createdAt, name, permissions, updatedAt, userNavigationAccessAutoID,
				userPermissionsAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPermissions other = (UserPermissions) obj;
		return Objects.equals(companyAutoID, other.companyAutoID) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(name, other.name) && Objects.equals(permissions, other.permissions)
				&& Objects.equals(updatedAt, other.updatedAt)
				&& Objects.equals(userNavigationAccessAutoID, other.userNavigationAccessAutoID)
				&& Objects.equals(userPermissionsAutoID, other.userPermissionsAutoID);
	}

	@Override
	public String toString() {
		return "UserPermissions [userPermissionsAutoID=" + userPermissionsAutoID + ", permissions=" + permissions
				+ ", name=" + name + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", userNavigationAccessAutoID=" + userNavigationAccessAutoID + ", companyAutoID=" + companyAutoID
				+ "]";
	}
	
	
}
