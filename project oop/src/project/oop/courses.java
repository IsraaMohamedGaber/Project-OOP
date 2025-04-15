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
public class courses {
    int i=0;
    protected String crsName;
    protected String code;
    protected student []stu;

    public courses(String crsName, String code) {
        this.crsName = crsName;
        this.code = code;
        
    }

   
    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStu(student[] stu) {
        this.stu = stu;
    }

    public String getCrsName() {
        return crsName;
    }

    public String getCode() {
        return code;
    }

    public student[] getStu() {
        return stu;
    }
    public void  numofstudents(int n){
    stu=new student[n];
    }
    public void addStudent(student s){
    stu[i++]=s;
    }
    public void showData(){
    System.out.println("course name: "+crsName+"\ncourse code: "+code);
    for(int i=0; i<stu.length;i++)
        System.out.println("student: "+stu[i].getName()+" "+stu[i].getId());
    }
    
    
}
