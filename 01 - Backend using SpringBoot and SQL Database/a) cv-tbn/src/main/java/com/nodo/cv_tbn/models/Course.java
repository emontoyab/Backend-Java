package com.nodo.cv_tbn.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;
    
    @Column(name="institution")
    private String institution;

    @Column(name="date_start")
    private String dateStart;

    @Column(name="date_end")
    private String dateEnd;

    @Column(name="certification")
    private boolean certification;


// Constructor
    public Course() {

    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getInstitution() {
        return this.institution;
    }

    public String getDateStart() {
        return this.dateStart;
    }

    public String getDateEnd() {
        return this.dateEnd;
    }

    public boolean getCertification() {
        return this.certification;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setInstitution(String institution){
        this.institution = institution;
    }

    public void setDateStart(String dateStart){
        this.dateStart = dateStart;
    }

    public void setDateEnd(String dateEnd){
        this.dateEnd = dateEnd;
    }

    public void setCertification(boolean certification){
        this.certification = certification;
    }

}
