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
public class person {     //super class
    protected String name;
    protected int id;
    protected String address;
    protected int birthday;
    //defult constructor
    public person(){}
    //full constructor
     public person(String name,int id,String address,int birthday){
     this.name=name;
     this.id=id;
     this.address=address;
     this.birthday=birthday;
     }

    public person(int id) {
        this.id = id;
    }
    
     
     public void setName(String name){
         this.name=name;
     }
     public void setId(int id){
     this.id=id;
     }
     public void setAddress(String address ){
         this.address=address;
     }
     public void setBirhday(int birthday){
     this.birthday=birthday;
     }
     public String getName(){
     return name;
     }
      public int getId(){
      return id;
      }
       public String getAddress(){
       return address;
       }
       public int getBirthday(){
       return  birthday;
       }
     //tostringmethod
     //make return to all information of person
    @Override
     public String toString(){
     return"name:"+name+"\tid:"+id+"\taddress:"+address+"\t birthday:"+birthday;
     }
 
}
