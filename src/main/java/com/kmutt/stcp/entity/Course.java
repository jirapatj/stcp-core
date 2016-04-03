package com.kmutt.stcp.entity;
// Generated Apr 2, 2016 6:17:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "stcpdb")
public class Course implements java.io.Serializable {


    private Integer id;
    private String code;
    private int courseId;
    private int credit;
    private String detail;
    private int maxStudent;
    private int minStudent;
    private String name;
    private int status;
    private int type;
    private Set courseLectures = new HashSet(0);
    private Set courseCurriculums = new HashSet(0);
    private Set coursePlans = new HashSet(0);
    private Set courseTimes = new HashSet(0);

    public Course() {
    }


    public Course(int courseId, int credit, int maxStudent, int minStudent, int status, int type) {
        this.courseId = courseId;
        this.credit = credit;
        this.maxStudent = maxStudent;
        this.minStudent = minStudent;
        this.status = status;
        this.type = type;
    }

    public Course(String code, int courseId, int credit, String detail, int maxStudent, int minStudent, String name, int status, int type, Set courseLectures, Set courseCurriculums, Set coursePlans, Set courseTimes) {
        this.code = code;
        this.courseId = courseId;
        this.credit = credit;
        this.detail = detail;
        this.maxStudent = maxStudent;
        this.minStudent = minStudent;
        this.name = name;
        this.status = status;
        this.type = type;
        this.courseLectures = courseLectures;
        this.courseCurriculums = courseCurriculums;
        this.coursePlans = coursePlans;
        this.courseTimes = courseTimes;
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


    @Column(name = "code", length = 45)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Column(name = "course_id", nullable = false)
    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    @Column(name = "credit", nullable = false)
    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    @Column(name = "detail")
    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    @Column(name = "max_student", nullable = false)
    public int getMaxStudent() {
        return this.maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }


    @Column(name = "min_student", nullable = false)
    public int getMinStudent() {
        return this.minStudent;
    }

    public void setMinStudent(int minStudent) {
        this.minStudent = minStudent;
    }


    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "status", nullable = false)
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Column(name = "type", nullable = false)
    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set getCourseLectures() {
        return this.courseLectures;
    }

    public void setCourseLectures(Set courseLectures) {
        this.courseLectures = courseLectures;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
    public Set getCourseCurriculums() {
        return this.courseCurriculums;
    }

    public void setCourseCurriculums(Set courseCurriculums) {
        this.courseCurriculums = courseCurriculums;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set getCoursePlans() {
        return this.coursePlans;
    }

    public void setCoursePlans(Set coursePlans) {
        this.coursePlans = coursePlans;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set getCourseTimes() {
        return this.courseTimes;
    }

    public void setCourseTimes(Set courseTimes) {
        this.courseTimes = courseTimes;
    }


}


