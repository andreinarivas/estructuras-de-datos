/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz2;

/**
 *
 * @author andre
 */
public class Tree {
    private Nodo root;
    private String name;
    private int size;
    
    public Tree(String name) {
        this.root = null;
        this.name=name;
        this.size=0;
    }
    
     public Nodo search(int data, Nodo root){
        if(root!=null){
            if(root.getData()>data){
                return search(data, root.getLeft());
            } else{
            if(root.getData()<data){
                return search(data, root.getRight());
            }
            else{
                return root;
            }
            }
        } else{
            return null;
        }
            
    }
    
     public String preorder(Nodo root){
        String toPrint="";
        if(root!=null){
            toPrint +=root.getData()+" ";
            toPrint+= preorder(root.getLeft());
            toPrint+= preorder(root.getRight());
        }
        return toPrint;
    }
    
      public void insert(Nodo newNodo, Nodo root){
        if(root!=null){
            if(root.getData()> newNodo.getData()){
                if(root.hasLeft()){
                    insert(newNodo, root.getLeft());
                }
                else{
                    root.setLeft(newNodo);
                    size++; 
                    
                }
            }
            if(root.getData()< newNodo.getData()){ 
                if(root.hasRight()){
                    insert(newNodo, root.getRight());
                }else{
                    root.setRight(newNodo);
                    size++; 
                }
            }
            
       }
       else{
            setRoot(newNodo);
            size++; 
       }
       
       
    }
    
    public boolean isEmpty(){
        return root==null;
        
    }
    
    
    /**
     * @return the root
     */
    public Nodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Nodo root) {
        this.root = root;
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
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
}
