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
@Table(name = "user_navigation_access")
@NamedQueries({ @NamedQuery(name = "UserNavigationAccess.findAll", query = "SELECT b FROM UserNavigationAccess b") })
public class UserNavigationAccess {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userNavigationAccessAutoID")
    private Long userNavigationAccessAutoID;
	@Column(unique = true)
    private String code;
    private String name;
    private String menuPath;
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "navigationMenuAutoID", referencedColumnName = "navigationMenuAutoID", nullable = false)
    private MstNavigationMenu navigationMenuAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userAutoID", referencedColumnName = "userAutoID", nullable = false)
    private User userAutoID;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userNavigationAccessAutoID")
	private List<UserPermissions> userPermissionsAutoID;

	public Long getUserNavigationAccessAutoID() {
		return userNavigationAccessAutoID;
	}

	public void setUserNavigationAccessAutoID(Long userNavigationAccessAutoID) {
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
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

	public String getMenuPath() {
		return menuPath;
	}

	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
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

	public MstNavigationMenu getNavigationMenuAutoID() {
		return navigationMenuAutoID;
	}

	public void setNavigationMenuAutoID(MstNavigationMenu navigationMenuAutoID) {
		this.navigationMenuAutoID = navigationMenuAutoID;
	}

	public User getUserAutoID() {
		return userAutoID;
	}

	public void setUserAutoID(User userAutoID) {
		this.userAutoID = userAutoID;
	}

	public Company getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}

	public List<UserPermissions> getUserPermissionsAutoID() {
		return userPermissionsAutoID;
	}

	public void setUserPermissionsAutoID(List<UserPermissions> userPermissionsAutoID) {
		this.userPermissionsAutoID = userPermissionsAutoID;
	}

	public UserNavigationAccess(Long userNavigationAccessAutoID, String code, String name, String menuPath,
			Date createdAt, Date updatedAt, MstNavigationMenu navigationMenuAutoID, User userAutoID,
			Company companyAutoID, List<UserPermissions> userPermissionsAutoID) {
		super();
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
		this.code = code;
		this.name = name;
		this.menuPath = menuPath;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.navigationMenuAutoID = navigationMenuAutoID;
		this.userAutoID = userAutoID;
		this.companyAutoID = companyAutoID;
		this.userPermissionsAutoID = userPermissionsAutoID;
	}

	public UserNavigationAccess() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, companyAutoID, createdAt, menuPath, name, navigationMenuAutoID, updatedAt, userAutoID,
				userNavigationAccessAutoID, userPermissionsAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserNavigationAccess other = (UserNavigationAccess) obj;
		return Objects.equals(code, other.code) && Objects.equals(companyAutoID, other.companyAutoID)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(menuPath, other.menuPath)
				&& Objects.equals(name, other.name) && Objects.equals(navigationMenuAutoID, other.navigationMenuAutoID)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(userAutoID, other.userAutoID)
				&& Objects.equals(userNavigationAccessAutoID, other.userNavigationAccessAutoID)
				&& Objects.equals(userPermissionsAutoID, other.userPermissionsAutoID);
	}

	@Override
	public String toString() {
		return "UserNavigationAccess [userNavigationAccessAutoID=" + userNavigationAccessAutoID + ", code=" + code
				+ ", name=" + name + ", menuPath=" + menuPath + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", navigationMenuAutoID=" + navigationMenuAutoID + ", userAutoID=" + userAutoID + ", companyAutoID="
				+ companyAutoID + ", userPermissionsAutoID=" + userPermissionsAutoID + "]";
	}
	
	
	
}
