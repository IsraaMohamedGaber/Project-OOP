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
public class furniture {
    protected int board;
    protected int classes;
    protected int Library;
    protected int Labs;
    protected int Computers;
    protected int Desks;
    public furniture(){}

 
  
    public furniture(int board, int classes, int Library, int Labs, int Computers, int Desks) {
        this.board = board;
        this.classes = classes;
        this.Library = Library;
        this.Labs = Labs;
        this.Computers = Computers;
        this.Desks = Desks;
    }
    
    public int getBoard() {
        return board;
    }

    public void setBoard(int board) {
        this.board = board;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getLibrary() {
        return Library;
    }

    public void setLibrary(int Library) {
        this.Library = Library;
    }

    public int getLabs() {
        return Labs;
    }

    public void setLabs(int Labs) {
        this.Labs = Labs;
    }

    public int getComputers() {
        return Computers;
    }

    public void setComputers(int Computers) {
        this.Computers = Computers;
    }

    public int getDesks() {
        return Desks;
    }

    public void setDesks(int Desks) {
        this.Desks = Desks;
    }
    @Override
    public String toString(){
        return "number of board:"+board +
               "\tnumber of classes:"+classes+
               "\tnumber of Library:"+Library+
               "\tnumber of Labs:"+Labs+
               "\nnumber of Computers:"+Computers+
                "\tnumber ofDesks:"+Desks; 
    }
}

