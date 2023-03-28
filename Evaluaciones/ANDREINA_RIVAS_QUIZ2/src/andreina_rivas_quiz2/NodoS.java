/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz2;

/**
 *
 * @author andre
 */
public class NodoS {
    public NodoS next;
    public Tree data;

    public NodoS(Tree data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public NodoS getNext() {
        return next;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setNext(NodoS pNext) {
        this.next = pNext;
    }

    /**
     * @return the data
     */
    public Tree getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Tree data) {
        this.data = data;
    }
    
    
}
