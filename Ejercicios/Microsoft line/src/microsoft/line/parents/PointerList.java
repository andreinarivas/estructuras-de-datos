/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public class PointerList implements List {
    
    Nodo pFirst;
    Nodo pLast;
    int size;

    public PointerList(){
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
    }

    @Override
    public void insert(Object data, int pos) {
        int count=1;
        Nodo newNodo = new Nodo(data);
        Nodo aux=pFirst;
        while(count<pos){
            if(count==(pos-1)){
                newNodo.setNext(aux.getNext());
                aux.setNext(newNodo);
            }
            else{
                aux=aux.getNext();
            }
            count++;
        } 
        size++;
    }

    @Override
    public void addAtEnd(Object data) {
        Nodo newNodo= new Nodo (data);
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            pLast.setNext(newNodo);
            pLast=newNodo;
        }
        size++;
    }

    @Override
    public void addFirst(Object data) {
        NodoD newNodo=new NodoD(data);
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            newNodo.setNext(pFirst);
            pFirst=newNodo;
        }
        size++;
    }

    @Override
    public void print() {
        Nodo aux = pFirst;
        while (aux!=null){
            System.out.println(aux.getData());
            aux=aux.getNext();
        }
    }

    @Override
    public void delete(Object remove) {
        Nodo wanted = (Nodo) remove;
        Nodo aux =pFirst;
        if(wanted==pFirst.getData()){
            pFirst=aux.getNext();
        }
        else{
        while (aux != null){
            if (aux.getNext()==wanted){
                aux.setNext(wanted.getNext());
            }
            else{
                aux=aux.getNext();
            }
        }
        }
        size--;
    }

    @Override
    public boolean isEmpty() {
        return pFirst==null;
    }

    @Override
    public Nodo search(Object data) {
        Nodo aux= pFirst;
        while(aux!=null){
            if (data==aux.getData()){
                return aux;
            }
            else{
                aux=aux.getNext();
            }
            
        }
        return null;
    }

    @Override
    public List copy() {
        PointerList copy = new PointerList();
        Nodo aux=pFirst;
        while (aux!=null){
            copy.addAtEnd(aux.getData());
            aux=aux.getNext();
        }
        return copy;
    }

    @Override
    public Nodo getFirst() {
        return pFirst;
    }

    @Override
    public Nodo getLast() {
        return pLast;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    
}
