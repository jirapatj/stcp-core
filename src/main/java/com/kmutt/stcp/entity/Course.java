package com.kmutt.stcp.entity;

// Generated Apr 3, 2016 11:22:28 AM by Hibernate Tools 4.3.1

import java.util.Date;
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
	private Subject subject;
	private String sessionId;
	private String semesterTerm;
	private Integer semesterYesr;
	private Integer classMin;
	private Integer classMax;
	private Integer status;
	private Date studyTime;
	private Date examTime;
	private Set<CourseLecture> courseLectures = new HashSet(0);

	public Course() {
	}

	public Course(Subject subject) {
		this.subject = subject;
	}

	public Course(Subject subject, String sessionId, String semesterTerm,
			Integer semesterYesr, Integer classMin, Integer classMax,
			Integer status, Date studyTime, Date examTime, Set courseLectures) {
		this.subject = subject;
		this.sessionId = sessionId;
		this.semesterTerm = semesterTerm;
		this.semesterYesr = semesterYesr;
		this.classMin = classMin;
		this.classMax = classMax;
		this.status = status;
		this.studyTime = studyTime;
		this.examTime = examTime;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", nullable = false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Column(name = "session_id", length = 45)
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "semester_term", length = 45)
	public String getSemesterTerm() {
		return this.semesterTerm;
	}

	public void setSemesterTerm(String semesterTerm) {
		this.semesterTerm = semesterTerm;
	}

	@Column(name = "semester_yesr")
	public Integer getSemesterYesr() {
		return this.semesterYesr;
	}

	public void setSemesterYesr(Integer semesterYesr) {
		this.semesterYesr = semesterYesr;
	}

	@Column(name = "class_min")
	public Integer getClassMin() {
		return this.classMin;
	}

	public void setClassMin(Integer classMin) {
		this.classMin = classMin;
	}

	@Column(name = "class_max")
	public Integer getClassMax() {
		return this.classMax;
	}

	public void setClassMax(Integer classMax) {
		this.classMax = classMax;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "study_time", length = 19)
	public Date getStudyTime() {
		return this.studyTime;
	}

	public void setStudyTime(Date studyTime) {
		this.studyTime = studyTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exam_time", length = 19)
	public Date getExamTime() {
		return this.examTime;
	}

	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
	public Set<CourseLecture> getCourseLectures() {
		return this.courseLectures;
	}

	public void setCourseLectures(Set<CourseLecture> courseLectures) {
		this.courseLectures = courseLectures;
	}

}
