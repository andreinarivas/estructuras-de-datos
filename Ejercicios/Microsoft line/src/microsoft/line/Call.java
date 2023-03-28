/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line;

import java.util.Random;

/**
 *
 * @author andre
 */
public class Call {
    
    private Random r = new Random();
    
    public int id;
    public String name;
    public int number;
    public String software;
    public String problem;

    public Call(String name, int number, String software, String problem) {
        this.id= r.nextInt(9999);
        this.name = name;
        this.number = number;
        this.software = software;
        this.problem = problem;
    }

    public String printable(){
        return "ORDER ID: "+Integer.toString(getId())+"\n Client name: "+getName()+"\n Client Number: "+Integer.toString(getNumber())+"\n Problem: "+getProblem();
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the software
     */
    public String getSoftware() {
        return software;
    }

    /**
     * @param software the software to set
     */
    public void setSoftware(String software) {
        this.software = software;
    }

    /**
     * @return the problem
     */
    public String getProblem() {
        return problem;
    }

    /**
     * @param problem the problem to set
     */
    public void setProblem(String problem) {
        this.problem = problem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
