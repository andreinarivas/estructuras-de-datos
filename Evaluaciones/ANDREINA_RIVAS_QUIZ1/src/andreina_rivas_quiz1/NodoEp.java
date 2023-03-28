/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz1;

/**
 *
 * @author andre
 */
public class NodoEp {
    
    public String name;
    public String sinopsis;
    public NodoEp next;
    public NodoEp bef;

    public NodoEp(String name, String sinopsis) {
        this.name = name;
        this.sinopsis = sinopsis;
        this.next=null;
        this.bef=null;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the next
     */
    public NodoEp getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoEp next) {
        this.next = next;
    }

    /**
     * @return the bef
     */
    public NodoEp getBef() {
        return bef;
    }

    /**
     * @param bef the bef to set
     */
    public void setBef(NodoEp bef) {
        this.bef = bef;
    }
    
    
    
    
}
