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
public class HourlyEmpolyee extends Employee {
    protected int working_hours;
    protected double hours_rate;
    public  HourlyEmpolyee(){
    super();
    }
     public  HourlyEmpolyee(String Name,double Age, String Address,String Nationality,double Salary,String Rank,String Job,int working_hours,double hours_rate){
     super(Name, Age,  Address, Nationality, Salary, Rank, Job);
     this.hours_rate=hours_rate;
     this.working_hours=working_hours;
     }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
   

    public double getHours_rate() {
        return hours_rate;
    }

    public void setHours_rate(double hours_rate) {
        this.hours_rate = hours_rate;
    }
    @Override
    public  String toString(){
    return super.toString()+"\tWorking Hours"+working_hours+"Hours Rate"+hours_rate;
    }
    
}
