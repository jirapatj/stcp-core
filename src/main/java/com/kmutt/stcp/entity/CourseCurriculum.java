package com.kmutt.stcp.entity;
// Generated Apr 2, 2016 6:17:49 PM by Hibernate Tools 4.3.1


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * CourseCurriculum generated by hbm2java
 */
@Entity
@Table(name = "course_curriculum", catalog = "stcpdb")
public class CourseCurriculum implements java.io.Serializable {


    private Integer id;
    private Course course;
    private Curriculum curriculum;

    public CourseCurriculum() {
    }

    public CourseCurriculum(Course course, Curriculum curriculum) {
        this.course = course;
        this.curriculum = curriculum;
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "curriculum_id", nullable = false)
    public Curriculum getCurriculum() {
        return this.curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }


}


