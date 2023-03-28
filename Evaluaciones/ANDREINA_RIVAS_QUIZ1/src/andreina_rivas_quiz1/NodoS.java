/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz1;

/**
 *
 * @author andre
 */
public class NodoS {
    
    public String name;
    public String sinopsis;
    public String type;
    public EpList episodes;
    
    public NodoS next;
    public NodoS bef;
            

    public NodoS(String name, String sinopsis, String type) {
        this.name = name;
        this.sinopsis = sinopsis;
        this.type = type;
        this.episodes= new EpList();
        this.next=null;
        this.bef=null;
    }
    
   public String print_episodes(){
       return episodes.printable();
   }
    
    public int getnEpisodes(){
        return episodes.getSize();
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the episodes
     */
    public EpList getEpisodes() {
        return episodes;
    }

    /**
     * @return the next
     */
    public NodoS getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoS next) {
        this.next = next;
    }

    /**
     * @return the bef
     */
    public NodoS getBef() {
        return bef;
    }

    /**
     * @param bef the bef to set
     */
    public void setBef(NodoS bef) {
        this.bef = bef;
    }
    
    
    
}
