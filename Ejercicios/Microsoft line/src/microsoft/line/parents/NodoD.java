/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public class NodoD extends Nodo{
    
        NodoD before;
    public NodoD(Object data) {
        super(data);
        this.before=null;    
    }
    
    public NodoD getBefore(){
        return before;
    }
    
    public void setBefore(NodoD before){
        this.before=before;
    }
}
