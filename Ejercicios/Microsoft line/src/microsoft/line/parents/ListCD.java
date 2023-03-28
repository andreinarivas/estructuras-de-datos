/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public class ListCD extends ListD{
    
    
    @Override
    public ListCD invert(){
         ListCD inverted = new ListCD();
        NodoD aux = (NodoD) pLast;
        do{
            inverted.addAtEnd(aux.getData());
            aux=(NodoD)aux.getBefore();
        } while (aux!=pLast);
        return inverted;
    }
    
       @Override
    public void addFirst(Object data){
        NodoD newNodo = new NodoD(data);
        if(isEmpty()){
            pFirst=pLast=newNodo;
            pLast.setNext(newNodo);
            pLast.setBefore(newNodo);
            pFirst.setNext(newNodo);
            pFirst.setBefore(newNodo);
        }else{
            pLast.setNext(newNodo);
            pFirst.setBefore(newNodo);
            newNodo.setNext(pFirst);
            newNodo.setBefore((NodoD)pLast);
            pFirst=newNodo;
        }
        size++;
    }
    
    @Override
    public void addAtEnd(Object data){
        NodoD newNodo = new NodoD(data);
        if(isEmpty()){
            pFirst=pLast=newNodo;
            pLast.setNext(newNodo);
            pLast.setBefore(newNodo);
            pFirst.setNext(newNodo);
            pFirst.setBefore(newNodo);
        }
        else{
            pLast.setNext(newNodo);
            newNodo.setBefore((NodoD)pLast);
            newNodo.setNext(pFirst);
            pFirst.setBefore(newNodo);
            pLast=newNodo;
        }
        size++;
    }
    
    @Override
    public void print(){
        Nodo aux = pFirst;
        do{
            System.out.println(aux.getData());
            aux=aux.getNext();
        }while(aux!=pFirst);
        
    }
    
    @Override
    public void delete(Object remove){
        NodoD wanted = (NodoD)remove;
        NodoD aux =(NodoD) pFirst;
        if(wanted==pFirst){
            pFirst=aux.getNext();
            pFirst.setBefore((NodoD)pLast);
            pLast.setNext(pFirst);
        }
        else{
        do{
            if (aux.getNext()==wanted){
                NodoD before = (NodoD)wanted.getNext();
                aux.setNext(wanted.getNext());
                before.setBefore(aux);
                
            }
            else{
                aux=(NodoD)aux.getNext();
            }
        } while(aux!=pFirst);
        }
        size--;
    }
    
    @Override
    public Nodo search(Object data){
        Nodo aux = pFirst;
        do {
            if (data==aux.getData()){
                return aux;
            }
            else{
                aux=aux.getNext();
            }
        }while(aux!=pFirst);
        
        return null;
    }
    
    @Override
    public ListCD copy(){
        ListCD copy = new ListCD();
        Nodo aux = pFirst;
        do {
            copy.addAtEnd(aux);
            aux=aux.getNext();
        } while(aux!=pFirst);
        return copy; 
    }
}
