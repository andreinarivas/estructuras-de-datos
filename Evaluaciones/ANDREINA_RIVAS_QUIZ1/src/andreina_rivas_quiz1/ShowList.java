/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz1;

/**
 *
 * @author andre
 */
public class ShowList {
    
    public NodoS pFirst;
    public NodoS pLast;
    public int size;

    public ShowList() {
    }
    
    
    public String print_kids(){
        if(!isEmpty()){
        String toPrint="";
        NodoS aux= getpFirst();
        while(aux!=null){
            if (aux.getType().equals("infantil")){
            toPrint+= aux.getName()+"\n";
            }
            aux=aux.getNext();
        }
        return toPrint;}
        return "NO HAY INFORMACION CARGADA";
    }

    public String print_adults(){
        if(!isEmpty()){
        String toPrint="";
        NodoS aux= getpFirst();
        while(aux!=null){
            if (aux.getType().equals("adulto")){
            toPrint+= aux.getName()+"\n";}
            aux=aux.getNext();
        }
        return toPrint;}
        return "NO HAY INFORMACION CARGADA";
    }
    
    public String print_all(){
        if(!isEmpty()){
        String toPrint="";
        NodoS aux= getpFirst();
        while(aux!=null){
            toPrint+= aux.getName()+"\n";
            aux=aux.getNext();
        }
        return toPrint;}
        return "NO HAY INFORMACION CARGADA";
    }
    
    public String printb_with_chapters(){
        if(!isEmpty()){
        String toPrint="";
        NodoS aux= getpLast();
        while(aux!=null){
            toPrint+= aux.getName()+"---"+Integer.toString(aux.getnEpisodes())+" capitulos"+"\n";
            aux=aux.getBef();
        }
        return toPrint;}
        return "NO HAY INFORMACION CARGADA";
    }
    
    
    public String print_with_chapters(){
        if(!isEmpty()){
        String toPrint="";
        NodoS aux= getpFirst();
        while(aux!=null){
            toPrint+= aux.getName()+"---"+Integer.toString(aux.getnEpisodes())+" capitulos"+"\n";
            aux=aux.getNext();
        }
        return toPrint;}
        return "NO HAY INFORMACION CARGADA";
    }
    
    public boolean isEmpty() {
        return pFirst==null;
    }

    public NodoS search(String name) {
        if(!isEmpty()){
        NodoS aux= getpFirst();
        String showN;
        while(aux!=null){
            showN=aux.getName().toLowerCase();
            if (name.equals(showN)){
                return aux;
            }
            else{
                aux=aux.getNext();
            }
            
        }}
        return null;
    }
    
    public void insert(NodoS newShow){
        
        int nEp= newShow.getnEpisodes();
        if(isEmpty()){
            pFirst=pLast= newShow;
            
        }else{
            if(nEp < getpFirst().getnEpisodes()){
                newShow.setNext(getpFirst());
                getpFirst().setBef(newShow);
                setpFirst(newShow);
            }
            else if(nEp > getpLast().getnEpisodes()){
                newShow.setBef(getpLast());
                getpLast().setNext(newShow);
                setpLast(newShow);
            }
            else{
                NodoS aux, before;
                aux=before= getpFirst();
                while((aux!=null)&& nEp >= aux.getnEpisodes()){
                    before=aux;
                    aux=aux.getNext();
                }
                newShow.setNext(aux);
                newShow.setBef(before);
                before.setNext(newShow);
                aux.setBef(newShow); 
            }   
        }
        size++;
    }
        
    
    /**
     * @return the pFirst
     */
    public NodoS getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoS pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoS getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoS pLast) {
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
