package com.example.springschedule.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "faculty_id")
    private Long faculty_id;
    @Column(name = "name")
    private String name;
    @Column(name = "short_name")
    private String short_name;

    public DepartmentEntity() {
    }

    public DepartmentEntity(Long id, Long faculty_id, String name, String short_name) {
        this.id = id;
        this.faculty_id = faculty_id;
        this.name = name;
        this.short_name = short_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Long faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }
}
