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
public class Employee {
    protected String Name ;
    protected double Age;
    protected String Address;
    protected String Nationality ;
    protected double Salary;
    protected String Rank;
    protected String Job;
public Employee () {
}
public Employee (String Name,double Age, String Address,String Nationality,double Salary,String Rank,String Job){
this.Name=Name;
this.Address=Address;
this.Age=Age;
this.Job=Job;
this.Rank=Rank;
this.Nationality=Nationality;
this.Salary=Salary;}
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }
    @Override
    public  String toString(){
    return "Name:"+Name+"\n Age:"+Age+"\n Address"+Address+"\n Nationality"+Nationality+"\n Salary"+Salary+"\n Rank"+"\n Job"+Job;
            
    }
 
    
}
