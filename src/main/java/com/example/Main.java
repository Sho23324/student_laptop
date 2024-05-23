package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Laptop;
import com.entity.Student;
import com.util.HibernateUtility;



public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        // Student s1 = new Student("Michael Jackson", 80);
        // Student s2 = new Student("John", 65);
        // Student s3 = new Student("Scarra", 70);
        // session.createQuery("from Student", Student.class);
        // session.persist(s1);
        // session.persist(s2);
        // session.persist(s3);
        Query<Student> s = session.createQuery("select s from Student s where s.name = :name" , Student.class);
        s.setParameter("name", "Justin Bieber");
        Student student = s.getSingleResult();
        Laptop laptop = new Laptop();
        Query<Laptop> l = session.createQuery("select s from Laptop s where s.lname = :lname" , Laptop.class);
        l.setParameter("lname", "HP");
        Laptop l1 = l.getSingleResult(); 
        System.out.println(student.getName() + " : "+ l1.getLname());
        // Laptop laptop = new Laptop();
        // laptop.setLname("MSI");
        // laptop.setStudent_id(s1);
        // session.persist(laptop);
        
        
        
        transaction.commit();
    }
   
}
//format for joining tables
 // Query<Student>student = session.createQuery("select s from Student s where s.name = :name", Student.class);
    // student.setParameter("name", "Htet Aung Win");
    // Student s1 = student.getSingleResult();
    // Laptop l1 = new Laptop();
    // l1.setStudent_id(s1);
    // l1.setLname("HP");
    // session.persist(l1);