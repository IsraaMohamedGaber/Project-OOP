/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

/**
 *
 * @author HP
 */
public class grade {
    protected String Name_of_Student;
   protected double Average;

    public grade(String Name_of_Student,double Average) {
       this.Name_of_Student=Name_of_Student;
        this.Average = Average;
        
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }
   @Override
    public String toString(){
    return "Name of Student:"+Name_of_Student+"\tGPA:"+Average;
    }
}
