package com.neranjan.gscomp285.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT b FROM User b") })
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userAutoID")
    private Long userAutoID;
    @Column(unique = true)
    private String username;
    private String password;
    private int status;
    
    
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
    
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "personAutoID", referencedColumnName = "personAutoID", nullable = false)
    private Person personAutoID;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userRoleAutoID", referencedColumnName = "userRoleAutoID", nullable = false)
    private UserRole userRoleAutoID;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userAutoID")
	private List<UserNavigationAccess> userNavigationAccessAutoID;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "companyAutoID", referencedColumnName = "companyAutoID", nullable = false)
    private Company companyAutoID;


	public Long getUserAutoID() {
		return userAutoID;
	}


	public void setUserAutoID(Long userAutoID) {
		this.userAutoID = userAutoID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public UserRole getUserRoleAutoID() {
		return userRoleAutoID;
	}


	public void setUserRoleAutoID(UserRole userRoleAutoID) {
		this.userRoleAutoID = userRoleAutoID;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public List<UserNavigationAccess> getUserNavigationAccessAutoID() {
		return userNavigationAccessAutoID;
	}


	public void setUserNavigationAccessAutoID(List<UserNavigationAccess> userNavigationAccessAutoID) {
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
	}
	
	public Company getCompanyAutoID() {
		return companyAutoID;
	}


	public void setCompanyAutoID(Company companyAutoID) {
		this.companyAutoID = companyAutoID;
	}


	public User(Long userAutoID, String username, String password, int status, Date createdAt, Date updatedAt,
			Person personAutoID, UserRole userRoleAutoID, List<UserNavigationAccess> userNavigationAccessAutoID,
			Company companyAutoID) {
		super();
		this.userAutoID = userAutoID;
		this.username = username;
		this.password = password;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.personAutoID = personAutoID;
		this.userRoleAutoID = userRoleAutoID;
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
		this.companyAutoID = companyAutoID;
	}


	public User() {
		super();
	}


	@Override
	public int hashCode() {
		return Objects.hash(companyAutoID, createdAt, password, personAutoID, status, updatedAt, userAutoID,
				userNavigationAccessAutoID, userRoleAutoID, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(companyAutoID, other.companyAutoID) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(password, other.password) && Objects.equals(personAutoID, other.personAutoID)
				&& status == other.status && Objects.equals(updatedAt, other.updatedAt)
				&& Objects.equals(userAutoID, other.userAutoID)
				&& Objects.equals(userNavigationAccessAutoID, other.userNavigationAccessAutoID)
				&& Objects.equals(userRoleAutoID, other.userRoleAutoID) && Objects.equals(username, other.username);
	}


	@Override
	public String toString() {
		return "User [userAutoID=" + userAutoID + ", username=" + username + ", password=" + password + ", status="
				+ status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", personAutoID=" + personAutoID
				+ ", userRoleAutoID=" + userRoleAutoID + ", userNavigationAccessAutoID=" + userNavigationAccessAutoID
				+ ", companyAutoID=" + companyAutoID + "]";
	}


	


	


	

	
    
    
}
