package com.kmutt.stcp.entity;

// Generated Apr 3, 2016 11:22:28 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "stcpdb")
public class User implements java.io.Serializable {

	private Integer id;
	private Curriculum curriculum;
	private String firstname;
	private String lastname;
	private Integer gender;
	private String address;
	private String email;
	private Date birthday;
	private String mobile;
	private String citizenId;
	private int semester;
	private String faculty;
	private String major;
	private Set<Account> accounts = new HashSet(0);

	public User() {
	}

	public User(String firstname, String lastname, String email,
			String citizenId, int semester, String faculty, String major) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.citizenId = citizenId;
		this.semester = semester;
		this.faculty = faculty;
		this.major = major;
	}

	public User(Curriculum curriculum, String firstname, String lastname,
			Integer gender, String address, String email, Date birthday,
			String mobile, String citizenId, int semester, String faculty,
			String major, Set accounts) {
		this.curriculum = curriculum;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.birthday = birthday;
		this.mobile = mobile;
		this.citizenId = citizenId;
		this.semester = semester;
		this.faculty = faculty;
		this.major = major;
		this.accounts = accounts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "curriculum_id")
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	@Column(name = "firstname", nullable = false, length = 45)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false, length = 45)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthday", length = 19)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "mobile", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "citizen_id", nullable = false, length = 20)
	public String getCitizenId() {
		return this.citizenId;
	}

	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}

	@Column(name = "semester", nullable = false)
	public int getSemester() {
		return this.semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Column(name = "faculty", nullable = false, length = 100)
	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Column(name = "major", nullable = false, length = 100)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
