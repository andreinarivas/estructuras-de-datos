/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz2;

/**
 *
 * @author andre
 */
public class Nodo {
     
    private String name_og;
    private Nodo left;
    private Nodo right;
    private int data;

    public Nodo(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
    
     public boolean hasRight(){
        return getRight()!=null;
    }
    
    public boolean hasLeft(){
        return getLeft()!=null;
    }
    
    public boolean isLeaf(){
        return (getLeft()==null && getRight()==null);
    }

    /**
     * @return the left
     */
    public Nodo getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Nodo left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Nodo getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Nodo right) {
        this.right = right;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @return the name_og
     */
    public String getName_og() {
        return name_og;
    }

    /**
     * @param name_og the name_og to set
     */
    public void setName_og(String name_og) {
        this.name_og = name_og;
    }
    
    
    
}
