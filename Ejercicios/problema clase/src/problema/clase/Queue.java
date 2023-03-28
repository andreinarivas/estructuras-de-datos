/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.clase;

/**
 *
 * @author andre
 */
public class Queue {
    
    public NodoP front;
    public NodoP back;
    public int size;

    public Queue() {
        this.front=null;
        this.back=null;
        this.size=0;
    }
    
    public boolean isEmpty(){
        return front==null;
    }
    
    public void queue(NodoP data){
        if(isEmpty()){
            front=back=data;
        }else{
            getBack().setNext(data);
            setBack(data);
            data.setNext(null);
        }
        size++;
    }
    
    public void dequeue(){
        setFront(getFront().getNext());
        size--;
    }
    
    public void print(){
        NodoP aux = this.getFront();
        NodoP in=aux;
        do{
            System.out.println(front.getData());
            dequeue();
            queue(in);
            in=this.getFront();
        }while(aux!=in);
    }

    /**
     * @return the front
     */
    public NodoP getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(NodoP front) {
        this.front = front;
    }

    /**
     * @return the back
     */
    public NodoP getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(NodoP back) {
        this.back = back;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}
