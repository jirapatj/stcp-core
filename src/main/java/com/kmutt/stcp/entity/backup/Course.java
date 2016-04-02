package com.kmutt.stcp.entity.backup;

// Generated Feb 18, 2016 11:08:21 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "stcpdb")
public class Course implements java.io.Serializable {

    private Integer id;
    private String code;
    private String name;
    private int minStudent;
    private int maxStudent;
    private String detail;
    private int credit;
    private int status;
    private int type;
    private int courseId;
    private Set<CoursePlan> coursePlans = new HashSet(0);
    private Set<CourseLecture> courseLectures = new HashSet(0);
    private Set<CourseTime> courseTimes = new HashSet(0);
    private Set<CourseCurriculum> courseCurriculums = new HashSet(0);

    public Course() {
    }

    public Course(int minStudent, int maxStudent, int credit, int status,
                  int type, int courseId) {
        this.minStudent = minStudent;
        this.maxStudent = maxStudent;
        this.credit = credit;
        this.status = status;
        this.type = type;
        this.courseId = courseId;
    }

    public Course(String code, String name, int minStudent, int maxStudent,
                  String detail, int credit, int status, int type, int courseId,
                  Set coursePlans, Set courseLectures, Set courseTimes,
                  Set courseCurriculums) {
        this.code = code;
        this.name = name;
        this.minStudent = minStudent;
        this.maxStudent = maxStudent;
        this.detail = detail;
        this.credit = credit;
        this.status = status;
        this.type = type;
        this.courseId = courseId;
        this.coursePlans = coursePlans;
        this.courseLectures = courseLectures;
        this.courseTimes = courseTimes;
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

    @Column(name = "code", length = 45)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "min_student", nullable = false)
    public int getMinStudent() {
        return this.minStudent;
    }

    public void setMinStudent(int minStudent) {
        this.minStudent = minStudent;
    }

    @Column(name = "max_student", nullable = false)
    public int getMaxStudent() {
        return this.maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    @Column(name = "detail")
    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Column(name = "credit", nullable = false)
    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
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

    @Column(name = "course_id", nullable = false)
    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set<CoursePlan> getCoursePlans() {
        return this.coursePlans;
    }

    public void setCoursePlans(Set<CoursePlan> coursePlans) {
        this.coursePlans = coursePlans;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set<CourseLecture> getCourseLectures() {
        return this.courseLectures;
    }

    public void setCourseLectures(Set<CourseLecture> courseLectures) {
        this.courseLectures = courseLectures;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set<CourseTime> getCourseTimes() {
        return this.courseTimes;
    }

    public void setCourseTimes(Set<CourseTime> courseTimes) {
        this.courseTimes = courseTimes;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
    public Set<CourseCurriculum> getCourseCurriculums() {
        return this.courseCurriculums;
    }

    public void setCourseCurriculums(Set<CourseCurriculum> courseCurriculums) {
        this.courseCurriculums = courseCurriculums;
    }

}
