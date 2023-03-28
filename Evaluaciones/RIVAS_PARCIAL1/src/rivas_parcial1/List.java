/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivas_parcial1;

/**
 *
 * @author andre
 */
public class List {
    
    Nodo pFirst;
    Nodo pLast;
    int size;

    public List(){
        this.pFirst=null;
        this.size=0;
    }
    
    public void insert_between(Nodo bef, Nodo ins) {
        Nodo aux = bef.getNext();
        bef.setNext(ins);
        ins.setNext(aux);
    }

    public void insert_with_last(Object data){
       Nodo newNodo= new Nodo (data);
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            pLast.setNext(newNodo);
            setLast(newNodo);
        }
        size++; 
    }
    
    
    public void insert(Object data) {
        Nodo newNodo= new Nodo (data);
        if(pFirst==null){
            pFirst=newNodo;
        }
        else{
            Nodo aux = getFirst();
            while(aux.getNext()!=null){
                aux=aux.getNext();
            }
            aux.setNext(newNodo);
        }
        size++;
    }

    public void addFirst(Object data) {
        Nodo newNodo=new Nodo(data);
        if(pFirst==null){
            pFirst=newNodo;
        }
        else{
            newNodo.setNext(pFirst);
            pFirst=newNodo;
        }
        size++;
    }

    public void print() {
        Nodo aux = pFirst;
        while (aux!=null){
            System.out.println(aux.getData());
            aux=aux.getNext();
        }
    }

    public void delete(Object remove) {
        Nodo aux =pFirst;
        Nodo bef = pFirst;
        if(remove==pFirst.getData()){
            pFirst=aux.getNext();
        }
        else {
        while (aux != null){
            if (aux.getData()==remove){
                bef.setNext(aux.getNext()); 
                if(aux.getData()==pLast.getData()){
                    setLast(bef);
                }
            }
            bef=aux;
            aux=aux.getNext();
            
        }
        }
        size--;
    }

    public boolean isEmpty() {
        return pFirst==null;
    }


    public Nodo getFirst() {
        return pFirst;
    }

   public Nodo getLast(){
       return pLast;
   }
   public void setLast(Nodo last){
       pLast=last;
   }
   public void setFirst(Nodo first){
       pFirst=first;
   }
   public int getSize(){
       return size;
   }
}
