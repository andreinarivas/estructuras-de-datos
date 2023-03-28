/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz1;

/**
 *
 * @author andre
 */
public class EpList {
    
    public NodoEp pFirst;
    public NodoEp pLast;
    
    public int size;

    public EpList() {
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
    }
    
    public String printable(){
        NodoEp aux = getpFirst();
        String toPrint="";
        while(aux!=null){
            toPrint+=aux.getName() +"\n";
            aux=aux.getNext();
        }
        return toPrint;
    }

    public void addAtEnd(NodoEp newEp) {
        if(isEmpty()){
            pFirst=pLast=newEp;
        }
        else{
            getpLast().setNext(newEp);
            newEp.setBef(getpLast());
            setpLast(newEp);
        }
        size++;
    }
     public boolean isEmpty() {
        return pFirst==null;
    }

    public NodoEp search(String name) {
        NodoEp aux= getpFirst();
        String epN;
        while(aux!=null){
            epN=aux.getName().toLowerCase();
            if (name.equals(epN)){
                return aux;
            }
            else{
                aux=aux.getNext();
            }
            
        }
        return null;
    }
    
    /**
     * @return the pFirst
     */
    public NodoEp getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoEp pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoEp getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoEp pLast) {
        this.pLast = pLast;
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
