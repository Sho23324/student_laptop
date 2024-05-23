package com.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "laptop_id")
    private Long lid;

    @Column(name = "laptop_name")
    private String lname;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = true)
    private Student student;

    public Laptop(){}

    public Laptop(String lname) {
        this.lname = lname;
    }
    
    public Long getLid() {
        return lid;
    }
    public void setLid(Long lid) {
        this.lid = lid;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent_id(Student student) {
        this.student = student;
    }
}
