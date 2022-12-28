package com.example.springschedule.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schedules")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "teacher_id")
    private Long teacher_id;
    @Column(name = "discipline_id")
    private Long discipline_id;
    @Column(name = "group_id")
    private Long group_id;
    @Column(name = "time")
    private String time;
    @Column(name = "classroom")
    private String classroom;

    public ScheduleEntity() {
    }

    public ScheduleEntity(Long id, String name, Long teacher_id, Long discipline_id, Long group_id, String time, String classroom) {
        this.id = id;
        this.name = name;
        this.teacher_id = teacher_id;
        this.discipline_id = discipline_id;
        this.group_id = group_id;
        this.time = time;
        this.classroom = classroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Long getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(Long discipline_id) {
        this.discipline_id = discipline_id;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
