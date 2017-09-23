package com.example.tutorial3.model;

/**
 * Created by hasyapasaribu on 9/20/17.
 */
public class StudentModel {
    private String name;
    private String npm;
    private double gpa;

    public StudentModel(String name, String npm, double gpa){
        this.name = name;
        this.npm = npm;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public String getNpm(){
        return npm;
    }

    public Double getGpa(){
        return gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNpm(String npm){
        this.npm = npm;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}