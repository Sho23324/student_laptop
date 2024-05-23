package com.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "rollno")
    private Long rollno;

    @Column(name = "studnet_name")
    private String name;

    @Column(name = "marks")
    private int marks;
    

    public Student(){}

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Long getRollno() {
        return rollno;
    }
    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
