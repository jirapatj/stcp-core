package com.kmutt.stcp.entity;
// Generated Apr 2, 2016 6:17:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account"
        , catalog = "stcpdb"
)
public class Account implements java.io.Serializable {


    private Integer id;
    private RoleUser roleUser;
    private User user;
    private String password;
    private String username;
    private Set courseLectures = new HashSet(0);
    private Set coursePlans = new HashSet(0);

    public Account() {
    }


    public Account(RoleUser roleUser, User user) {
        this.roleUser = roleUser;
        this.user = user;
    }

    public Account(RoleUser roleUser, User user, String password, String username, Set courseLectures, Set coursePlans) {
        this.roleUser = roleUser;
        this.user = user;
        this.password = password;
        this.username = username;
        this.courseLectures = courseLectures;
        this.coursePlans = coursePlans;
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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_user_id", nullable = false)
    public RoleUser getRoleUser() {
        return this.roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Column(name = "password", length = 45)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Column(name = "username", length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    public Set getCourseLectures() {
        return this.courseLectures;
    }

    public void setCourseLectures(Set courseLectures) {
        this.courseLectures = courseLectures;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    public Set getCoursePlans() {
        return this.coursePlans;
    }

    public void setCoursePlans(Set coursePlans) {
        this.coursePlans = coursePlans;
    }


}


