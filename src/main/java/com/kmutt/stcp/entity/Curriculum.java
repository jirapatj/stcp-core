package com.kmutt.stcp.entity;
// Generated Apr 2, 2016 6:17:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Curriculum generated by hbm2java
 */
@Entity
@Table(name = "curriculum"
        , catalog = "stcpdb"
)
public class Curriculum implements java.io.Serializable {


    private Integer id;
    private Integer accId;
    private String name;
    private String startYear;
    private String startedYear;
    private Set courseCurriculums = new HashSet(0);

    public Curriculum() {
    }

    public Curriculum(Integer accId, String name, String startYear, String startedYear, Set courseCurriculums) {
        this.accId = accId;
        this.name = name;
        this.startYear = startYear;
        this.startedYear = startedYear;
        this.courseCurriculums = courseCurriculums;
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


    @Column(name = "acc_id")
    public Integer getAccId() {
        return this.accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }


    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "start_year", length = 45)
    public String getStartYear() {
        return this.startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }


    @Column(name = "started_year", length = 45)
    public String getStartedYear() {
        return this.startedYear;
    }

    public void setStartedYear(String startedYear) {
        this.startedYear = startedYear;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "curriculum", cascade = CascadeType.ALL)
    public Set getCourseCurriculums() {
        return this.courseCurriculums;
    }

    public void setCourseCurriculums(Set courseCurriculums) {
        this.courseCurriculums = courseCurriculums;
    }


}


