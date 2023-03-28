/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author andre
 */
public class Nodo{ 
    private Nodo next;
    private Nodo before;
    private Object element;
    
    public Nodo(Object element) {
        this.next = null;
        this.before=null;
        this.element=element;
        
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * @return the before
     */
    public Nodo getBefore() {
        return before;
    }

    /**
     * @param before the before to set
     */
    public void setBefore(Nodo before) {
        this.before = before;
    }
    
    
}
