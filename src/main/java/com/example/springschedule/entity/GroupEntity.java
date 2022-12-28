package com.example.springschedule.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "groups")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "department_id")
    private Long department_id;
    @Column(name = "name")
    private String name;
    @Column(name = "course")
    private Long course;

    public GroupEntity() {
    }

    public GroupEntity(Long id, Long department_id, String name, Long course) {
        this.id = id;
        this.department_id = department_id;
        this.name = name;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }
}
