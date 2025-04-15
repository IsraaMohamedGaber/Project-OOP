/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProjectOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner s =new Scanner(System.in);
        //create 10 object
        //create Array contin 5 person
        person[] p=new person[5];
        int answer;  //user answer
        String name, address, levelclass; //declare variable
        int id,birthday ;
        double salary,gpa;
        //menu this show to user
        for(int i=0;i<p.length;i++){
        System.out.println(
        "TO Create student information press 1"
        +"\nTo create Teacher information press 2"
        +"\nTo register student  and courses 3 "
        +"\nTo see student that register subject with name and subject press4"        
        +"\nTo see Salaried Employee informatio press 5"
        +"\nTo see Hourly Empolyee information press 6"
        +"\nTo see grade press 7"
        +"\nTo see name of student and grade press 8"
        +"\nTo see information about school furntire press 9"
        +"\nTo see information about school Books press 10");
         answer =s.nextInt();
          switch(answer){
       /*   case 1:
              //creation of person object after enter his information
              System.out.println("Enter person name:");
              name=s.next();//to make user put full name
              System.out.println("Enter ID:");
              id=s.nextInt();
              System.out.println("Enter your address");
              address=s.next(); //bec. address contian more than one word and contian number
              System.out.println("Enter your birthday:");
              birthday=s.nextInt();
              //now create object of person
              person p1=new person(name, id, address,birthday);
              System.out.println(p1.toString());
              break;*/
              case 1:
              System.out.println("Enter student name:");
              name=s.next();//to make user put full name
              System.out.println("Enter ID:");
              id=s.nextInt();
              System.out.println("Enter your address");
              address=s.next();
              System.out.println("Enter your birthday:");
              birthday=s.nextInt();
              System.out.println("Enter your levelclass");
              levelclass=s.next();
            //  to create object student class
              System.out.println("Enter your Gpa of Last year");
              gpa=s.nextDouble();
              student s1 = new student(name, id, address,birthday,  levelclass,gpa);
              System.out.println(s1.toString());
              break;
              case 2:

              System.out.println("Enter teacher name:");
              name=s.next();//to make user put full name
              System.out.println("Enter ID:");
              id=s.nextInt();
              System.out.println("Enter your address");
              address=s.next();
              System.out.println("Enter your birthday:");
              birthday=s.nextInt();
              System.out.println("Enter your salary in last jop");
              salary=s.nextDouble();
             Teachers t1=new Teachers( name,id,address,birthday, salary);
              System.out.println(t1.toString());
              break;
              case 3:
              System.out.println("Enter number of student That want to Regisrtion");
              int numStu=s.nextInt();
               System.out.println("Enter number of Courses That want to Regisrtion ");
              int numCrs=s.nextInt();
              String[][]stuInfo= new String[numStu][2];
              String[][]crsInfo= new String[numCrs][2];
              for(i=0; i<numStu;i++) {
        
              System.out.println("Enter data of student "+i+1);
              for(int j=0; j<2; j++)
             {  
            stuInfo[i][j]=s.next();
            
             }
             }
             for( i=0; i<numCrs;i++)
             {
             System.out.println("Enter data of course "+i+1);
             for(int j=0; j<2; j++)
             {  
             crsInfo[i][j]=s.next();
             }
             }
             break;
              case 4:
     student s5= new student("salma", 12345);
     student s2= new student("samy", 789345);
   
     
     courses c1= new courses ("Analytic math", "m206");
     courses c2= new courses("math1CS", "c200");
     courses c3= new courses("web", "cs40056");
     
     s5.numOfCourses(2);
     s2.numOfCourses(3);
     
     c1.numofstudents(2);
     c2.numofstudents(1);
     
     s5.addCourse(c3);
     s5.addCourse(c2);
     
     s2.addCourse(c1);
     s2.addCourse(c2);
     s2.addCourse(c3);
     
     c1.addStudent(s2);
     c1.addStudent(s5);
     
     c2.addStudent(s2);
     
     s5.showData();
     s2.showData();
     
     c1.showData();
                  break;
            case 5:
            salariedEmployee s7=new salariedEmployee ("Ahmed",30,"ridyda","egypt",3000,"manger","Teacter",5000,100);
           /* System.out.println(s7.getSalary());
            System.out.println(s7.getDeduction());
            System.out.println(s7.getName());
            Employee h=new Employee("ahmed",10,"cairo","sada",30,"Dasdas","fsfsd");
            System.out.println(h.getAddress());*/
            s7.showData();
            System.out.println("Total Salary After Duction"+s7.getSalary()+"\n");
            salariedEmployee s8 =new salariedEmployee ("Mohamed",30,"ridyda","egypt",6000,"manger","Teacter",5000,500);
            s8.showData();
            System.out.println("Total Salary After Duction"+s8.getSalary()+"\n");
            break;
            case 6:
             HourlyEmpolyee en=new HourlyEmpolyee("hamza",40,"Alex","egypt",3500,"Employee of First Degree","Teacter",13,200); 
             
             System.out.println(en.toString()+"\n");
             break;
             case 7:
             System.out.println("Enter average of your marks (less than 100)::");
             int average = s.nextInt();
             char grade;

            if(average>=80){
              grade = 'A';
             }else if(average>=60 && average<80){
             grade = 'B'; }
             else if(average>=40 && average<60){
             grade = 'C';
             }
            else {
            grade = 'D';
             }
             switch(grade) {
             case 'A' :
             System.out.println("Excellent!");
             break;
             case 'B' :
             case 'C' :
             System.out.println("Well done");
             break;
             case 'D' :
             System.out.println("You passed");
             case 'F' :
             System.out.println("Better try again");
             break;
             default :
             System.out.println("Invalid grade");
             }
             System.out.println("Your grade is " + grade);
             break;
             case 8:
             grade g=new grade("Ahmed",3.5);
             System.out.println(g.toString()+"\n");
             grade g1=new grade("Mohamed",3.4);
             System.out.println(g1.toString()+"\n");
             grade g2=new grade("Mohamoud",3.4);
             System.out.println(g2.toString()+"\n");
             grade g3=new grade("Samy",3);
             System.out.println(g3.toString()+"\n");
             grade g4=new grade("Salma",3);
             System.out.println(g3.toString()+"\n");
             break;   
             case 9:
              furniture f1 =new furniture(50,40,10,15,20,100);
              System.out.println(f1.toString());
              System.out.println(""); 
             break;
             case 10:
              Books b1=new Books(1,22,"chemistry"); 
              
              System.out.println(b1.toString());
              Books b2=new Books(2,20,"biochemistrychemistry"); 
             System.out.println(b2.toString());
               Books b3=new Books(3,40,"Math"); 
             System.out.println(b3.toString());
               Books b4=new Books(4,60,"computer"); 
             System.out.println(b4.toString());
               Books b5=new Books(5,70,"biology"); 
             System.out.println(b5.toString());
               Books b6=new Books(7,60,"Social  studies"); 
             System.out.println(b6.toString());
               Books b7=new Books(8,90,"pure Math"); 
             System.out.println(b7.toString());
                break;
             default:
             System.out.println("Invalid option");
             }
        }
      }
    }

