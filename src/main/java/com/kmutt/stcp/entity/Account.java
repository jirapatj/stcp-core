package com.kmutt.stcp.entity;

// Generated Apr 3, 2016 11:22:28 AM by Hibernate Tools 4.3.1

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "stcpdb")
public class Account implements java.io.Serializable {

	private Integer id;
	private RoleUser roleUser;
	private User user;
	private String username;
	private String password;
	private Set<CoursePlan> coursePlans = new HashSet(0);
	private Set<CourseLecture> courseLectures = new HashSet(0);

	public Account() {
	}

	public Account(RoleUser roleUser, User user) {
		this.roleUser = roleUser;
		this.user = user;
	}

	public Account(RoleUser roleUser, User user, String username,
			String password, Set coursePlans, Set courseLectures) {
		this.roleUser = roleUser;
		this.user = user;
		this.username = username;
		this.password = password;
		this.coursePlans = coursePlans;
		this.courseLectures = courseLectures;
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
	@JoinColumn(name = "role_user_id")
	public RoleUser getRoleUser() {
		return this.roleUser;
	}

	public void setRoleUser(RoleUser roleUser) {
		this.roleUser = roleUser;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "account", cascade = CascadeType.ALL)
	public Set<CoursePlan> getCoursePlans() {
		return this.coursePlans;
	}

	public void setCoursePlans(Set<CoursePlan> coursePlans) {
		this.coursePlans = coursePlans;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "account", cascade = CascadeType.ALL)
	public Set<CourseLecture> getCourseLectures() {
		return this.courseLectures;
	}

	public void setCourseLectures(Set<CourseLecture> courseLectures) {
		this.courseLectures = courseLectures;
	}

}
