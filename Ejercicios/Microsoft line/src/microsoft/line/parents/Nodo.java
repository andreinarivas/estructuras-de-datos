/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public class Nodo {
    
    Object data;
    Nodo next;

    public Nodo(Object data) {
        this.data = data;
        this.next=null;
    }
    
    public Object getData(){
        return data;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setData(Object data){
        this.data=data;
    }
    
    public void setNext(Nodo next){
        this.next=next;
    }

    void setBefore(NodoD newNodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
