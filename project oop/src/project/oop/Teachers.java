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
public class Teachers extends person { //child class 
   private double salary;
    public Teachers(){
    super();
    }
    /**
     *
     * @param name
     * @param id
     * @param address
     * @param birthday
     * @param salary
     */
    public Teachers(String name,int id,String address,int birthday,double salary){
     super(name, id,address,birthday);
     this.salary=salary;
     }
      public void setSalary (double salary)
    {this.salary=salary;
    }
      public double getSalary(){
          return salary;
      }     
    @Override
      public String toString(){
    return super.toString()+"\tsalary" +salary;
            }
    
}
