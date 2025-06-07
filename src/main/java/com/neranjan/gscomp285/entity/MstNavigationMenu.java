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
@Table(name = "mst_navigation_menu")
@NamedQueries({ @NamedQuery(name = "MstNavigationMenu.findAll", query = "SELECT b FROM MstNavigationMenu b") })
public class MstNavigationMenu {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "navigationMenuAutoID")
    private Long navigationMenuAutoID;
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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "navigationMenuAutoID")
	private List<UserNavigationAccess> userNavigationAccessAutoID;

	public Long getNavigationMenuAutoID() {
		return navigationMenuAutoID;
	}

	public void setNavigationMenuAutoID(Long navigationMenuAutoID) {
		this.navigationMenuAutoID = navigationMenuAutoID;
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

	public List<UserNavigationAccess> getUserNavigationAccessAutoID() {
		return userNavigationAccessAutoID;
	}

	public void setUserNavigationAccessAutoID(List<UserNavigationAccess> userNavigationAccessAutoID) {
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
	}

	public MstNavigationMenu(Long navigationMenuAutoID, String code, String name, String menuPath, Date createdAt,
			Date updatedAt, List<UserNavigationAccess> userNavigationAccessAutoID) {
		super();
		this.navigationMenuAutoID = navigationMenuAutoID;
		this.code = code;
		this.name = name;
		this.menuPath = menuPath;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
	}

	public MstNavigationMenu() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, createdAt, menuPath, name, navigationMenuAutoID, updatedAt,
				userNavigationAccessAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MstNavigationMenu other = (MstNavigationMenu) obj;
		return Objects.equals(code, other.code) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(menuPath, other.menuPath) && Objects.equals(name, other.name)
				&& Objects.equals(navigationMenuAutoID, other.navigationMenuAutoID)
				&& Objects.equals(updatedAt, other.updatedAt)
				&& Objects.equals(userNavigationAccessAutoID, other.userNavigationAccessAutoID);
	}

	@Override
	public String toString() {
		return "MstNavigationMenu [navigationMenuAutoID=" + navigationMenuAutoID + ", code=" + code + ", name=" + name
				+ ", menuPath=" + menuPath + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", userNavigationAccessAutoID=" + userNavigationAccessAutoID + "]";
	}
	
	
}
