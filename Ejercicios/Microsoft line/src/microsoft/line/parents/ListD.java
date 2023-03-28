/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public class ListD extends PointerList{


    public ListD() {
        
    }
    
    
    public ListD invert(){
        ListD inverted = new ListD();
        NodoD aux = (NodoD) pLast;
        while(aux!=null){
            inverted.addAtEnd(aux.getData());
            aux=(NodoD) aux.getBefore();
        }
        return inverted;
    }
    
    @Override
    public void insert(Object data, int pos) {
        int count=1;
        NodoD newNodo = new NodoD(data);
        NodoD aux= (NodoD) pFirst;
        NodoD before = (NodoD) pFirst;
        while(count<=pos){
            if(count==pos){
                before.setNext(newNodo);
                aux.setBefore(newNodo);
                newNodo.setNext(aux);
                newNodo.setBefore(before);
                
            }
            else{
                before=aux;
                aux=(NodoD)aux.getNext();
            }
            count++;   
        }
        size++;
    }

    @Override
    public void addAtEnd(Object data) {
        NodoD newNodo= new NodoD(data);
        pFirst = (NodoD) pFirst;
        pLast=(NodoD)pLast;
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            pLast.setNext(newNodo);
            newNodo.setBefore((NodoD)pLast);
            pLast=newNodo;
        }
        size++;
    }

    @Override
    public void addFirst(Object data) {
        NodoD newNodo = new NodoD(data);
        pFirst = (NodoD) pFirst;
        pLast=(NodoD)pLast;
        if(pFirst==null){
            pFirst=pLast=newNodo;
        }
        else{
            pFirst.setBefore(newNodo);
            newNodo.setNext((NodoD)pFirst);
            pFirst=newNodo;
        }
        size++;
        
    }

   
    @Override
    public void delete(Object remove) {
        NodoD wanted= (NodoD)remove;
        NodoD aux = (NodoD)pFirst;
        if(wanted==pFirst){
            pFirst=aux.getNext();
            pFirst.setBefore(null);
        }
        else{
        while (aux != null){
            if (aux.getNext()==remove){
                wanted.getNext().setBefore(aux);
                aux.setNext(wanted.getNext());
            }
            else{
                aux=(NodoD) aux.getNext();
            }
        }
        }
        size--;
        
    }
   
}
