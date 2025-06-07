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
@Table(name = "company")
@NamedQueries({ @NamedQuery(name = "Company.findAll", query = "SELECT b FROM Company b") })
public class Company {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyAutoID")
    private Long companyAutoID;
	@Column(unique = true)
    private String code;
    private String name;
    private String companyLogo;
    private String defaultTimeZone;
    private String defaultCurrency;
    private String country;
    private String email;
    private int currencyDecimalPlace;
    @Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<User> userAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<UserRole> userRoleAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<UserNavigationAccess> userNavigationAccessAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<UserPermissions> userPermissionsAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<Person> personAutoID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "companyAutoID")
	private List<PersonContact> personContactAutoID;

	public Long getCompanyAutoID() {
		return companyAutoID;
	}

	public void setCompanyAutoID(Long companyAutoID) {
		this.companyAutoID = companyAutoID;
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

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(String defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCurrencyDecimalPlace() {
		return currencyDecimalPlace;
	}

	public void setCurrencyDecimalPlace(int currencyDecimalPlace) {
		this.currencyDecimalPlace = currencyDecimalPlace;
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

	public List<UserRole> getUserRoleAutoID() {
		return userRoleAutoID;
	}

	public void setUserRoleAutoID(List<UserRole> userRoleAutoID) {
		this.userRoleAutoID = userRoleAutoID;
	}

	public List<UserNavigationAccess> getUserNavigationAccessAutoID() {
		return userNavigationAccessAutoID;
	}

	public void setUserNavigationAccessAutoID(List<UserNavigationAccess> userNavigationAccessAutoID) {
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
	}

	public List<UserPermissions> getUserPermissionsAutoID() {
		return userPermissionsAutoID;
	}

	public void setUserPermissionsAutoID(List<UserPermissions> userPermissionsAutoID) {
		this.userPermissionsAutoID = userPermissionsAutoID;
	}

	public List<Person> getPersonAutoID() {
		return personAutoID;
	}

	public void setPersonAutoID(List<Person> personAutoID) {
		this.personAutoID = personAutoID;
	}

	public List<PersonContact> getPersonContactAutoID() {
		return personContactAutoID;
	}

	public void setPersonContactAutoID(List<PersonContact> personContactAutoID) {
		this.personContactAutoID = personContactAutoID;
	}

	public Company(Long companyAutoID, String code, String name, String companyLogo, String defaultTimeZone,
			String defaultCurrency, String country, String email, int currencyDecimalPlace, Date createdAt,
			Date updatedAt, List<User> userAutoID, List<UserRole> userRoleAutoID,
			List<UserNavigationAccess> userNavigationAccessAutoID, List<UserPermissions> userPermissionsAutoID,
			List<Person> personAutoID, List<PersonContact> personContactAutoID) {
		super();
		this.companyAutoID = companyAutoID;
		this.code = code;
		this.name = name;
		this.companyLogo = companyLogo;
		this.defaultTimeZone = defaultTimeZone;
		this.defaultCurrency = defaultCurrency;
		this.country = country;
		this.email = email;
		this.currencyDecimalPlace = currencyDecimalPlace;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userAutoID = userAutoID;
		this.userRoleAutoID = userRoleAutoID;
		this.userNavigationAccessAutoID = userNavigationAccessAutoID;
		this.userPermissionsAutoID = userPermissionsAutoID;
		this.personAutoID = personAutoID;
		this.personContactAutoID = personContactAutoID;
	}

	public Company() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, companyAutoID, companyLogo, country, createdAt, currencyDecimalPlace, defaultCurrency,
				defaultTimeZone, email, name, personAutoID, personContactAutoID, updatedAt, userAutoID,
				userNavigationAccessAutoID, userPermissionsAutoID, userRoleAutoID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(code, other.code) && Objects.equals(companyAutoID, other.companyAutoID)
				&& Objects.equals(companyLogo, other.companyLogo) && Objects.equals(country, other.country)
				&& Objects.equals(createdAt, other.createdAt) && currencyDecimalPlace == other.currencyDecimalPlace
				&& Objects.equals(defaultCurrency, other.defaultCurrency)
				&& Objects.equals(defaultTimeZone, other.defaultTimeZone) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(personAutoID, other.personAutoID)
				&& Objects.equals(personContactAutoID, other.personContactAutoID)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(userAutoID, other.userAutoID)
				&& Objects.equals(userNavigationAccessAutoID, other.userNavigationAccessAutoID)
				&& Objects.equals(userPermissionsAutoID, other.userPermissionsAutoID)
				&& Objects.equals(userRoleAutoID, other.userRoleAutoID);
	}

	@Override
	public String toString() {
		return "Company [companyAutoID=" + companyAutoID + ", code=" + code + ", name=" + name + ", companyLogo="
				+ companyLogo + ", defaultTimeZone=" + defaultTimeZone + ", defaultCurrency=" + defaultCurrency
				+ ", country=" + country + ", email=" + email + ", currencyDecimalPlace=" + currencyDecimalPlace
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", userAutoID=" + userAutoID
				+ ", userRoleAutoID=" + userRoleAutoID + ", userNavigationAccessAutoID=" + userNavigationAccessAutoID
				+ ", userPermissionsAutoID=" + userPermissionsAutoID + ", personAutoID=" + personAutoID
				+ ", personContactAutoID=" + personContactAutoID + "]";
	}

	
	
	
}
