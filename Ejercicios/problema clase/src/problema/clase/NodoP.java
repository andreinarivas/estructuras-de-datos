/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.clase;

/**
 *
 * @author andre
 */
public class NodoP {
    
    public int data;
    public NodoP next;

    public NodoP(int data) {
        this.data = data;
        this.next=null;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public NodoP getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoP next) {
        this.next = next;
    }
    
    
    
    
}
