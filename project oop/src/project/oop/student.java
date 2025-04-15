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
public class student extends person {  //chiled class
   int i=0;
   protected String levelclass;
   protected double gpa;
   protected courses[] crs;
    //defult constructor
    public  student(){
    super(); 
      //to invoke the default const of super class  
    }
    //full paramter constructor
    public  student(String name,int id,String address,int birthday,String levelclass,double gpa){
    super(name, id, address ,birthday);//نفس ترتيب في person
    this.levelclass=levelclass;    
    this.gpa=gpa;
    }
     public  student(String name,int id){
     super(id);
     this.name=name;
     }

    
             
 
     public void setLevelclass(String levelclass){
     this.levelclass=levelclass;
     }
     public void setGpa(double gpa){
         this.gpa=gpa;
     }
      public String getLevelclass(){
      return levelclass;
      }
      public double getGpa(){
          return gpa;
      }

    public courses[] getCrs() {
        return crs;
    }

    public void setCrs(courses[] crs) {
        this.crs = crs;
    }
     public void addCourse(courses c)
    {
        crs[i++]=c;
    }
    
    public void numOfCourses(int n)
    {
        crs= new courses[n];
    }
      
    //tostring method()
    @Override
    public String toString(){
    return super.toString()+"\tlevelclass:"+levelclass+"\t\tGpa:"+gpa;
    }
    //method ro display person information and student
     public void showData()
    {
        System.out.println("student name: "+super.getName()+"\nstudent id: "+super.getId()/*+
               "\n address"+super.getAddress()+"birthday"+super.getBirthday()+"\tGpa:"+gpa*/);
        for(int i=0; i<crs.length;i++)
            System.out.println("course: "+crs[i].getCrsName()+" "+crs[i].getCode());
    }
    }

