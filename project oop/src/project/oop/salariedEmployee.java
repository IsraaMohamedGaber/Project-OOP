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
public class salariedEmployee extends Employee  {
    protected double Bounes;
    protected double Deduction;
    public  salariedEmployee (){
    super();
    
    }
    public salariedEmployee(String Name,double Age, String Address,String Nationality,double Salary,String Rank,String Job,double Bounes, double Deduction)
    {super(Name, Age,  Address, Nationality, Salary,Rank, Job);
    this.Bounes=Bounes;
    this.Deduction=Deduction;
    }

    public double getBounes() {
        return Bounes;
    }

    public void setBounes(double Bounes) {
        this.Bounes = Bounes;
    }

    public double getDeduction() {
        return Deduction;
    }

    public void setDeduction(double Deduction) {
        this.Deduction = Deduction;
    }

    @Override
    public double getSalary() {
        return Salary+Bounes-Deduction;
    }
    @Override
    public String toString(){
        return super.toString()+"\nBounes"+Bounes+"\nDeduction"+Deduction;              
                } 
       public void showData(){
    System.out.println("Employee Name:"+super.getName()+
    "\t\tAge:"+super.getAge()+"\t\tAddress:"+super.getAddress()+
    "\t\tNationality:"+super.getNationality()+"\nSalary:"+super.getSalary()+
    "\t\tRank:"+super.getRank()+"\t\tJob:"+super.getJob()+
    "\t\tBounes"+Bounes+"\t\tDeduction"+Deduction );
    }
}
