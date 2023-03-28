/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz2;

/**
 *
 * @author andre
 */
public class Stack {
    public NodoS top;
    public int size;

    public Stack() {
        this.top=null;
        this.size = 0;
    }
    
    
    

    public NodoS pop(){
        if(!isEmpty()){
            NodoS p = getTop();
            setTop(p.getNext());
            size--;
            return p;
        }else{
            return null;
        }
    }
    
    public void push(Tree data){
        NodoS newNodo = new NodoS(data);
        if(!isEmpty()){
            newNodo.setNext(getTop());
            setTop(newNodo);
        }else{
            setTop(newNodo);
        }
        size++;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    /**
     * @return the top
     */
    public NodoS getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(NodoS top) {
        this.top = top;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
    
}
