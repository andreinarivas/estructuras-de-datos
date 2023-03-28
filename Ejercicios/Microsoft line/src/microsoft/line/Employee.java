/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line;

import javax.swing.DefaultListModel;
import microsoft.line.parents.Nodo;
import microsoft.line.parents.PointerList;

/**
 *
 * @author andre
 */
public class Employee {
    
    public String name;
    public String software;
    public int nCalls;
    public PointerList CallList;

    public Employee(String name, String software, int nCalls) {
        this.name = name;
        this.software = software;
        this.nCalls = nCalls;
        this.CallList= new PointerList();
    }

    public void increaseC(){
        nCalls++;
    }
    
    
    public void newCall(Call call){
        CallList.addAtEnd(call);
        increaseC();
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
     * @return the nCalls
     */
    public int getnCalls() {
        return nCalls;
    }

    /**
     * @param nCalls the nCalls to set
     */
    public void setnCalls(int nCalls) {
        this.nCalls = nCalls;
    }
    
    
    
}
