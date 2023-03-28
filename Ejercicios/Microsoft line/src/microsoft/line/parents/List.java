/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package microsoft.line.parents;

/**
 *
 * @author andre
 */
public interface List {
    
    public void insert(Object data, int pos);
    
    public void addAtEnd(Object data);
    
    public void addFirst(Object data);
    
    public void print();
    
    public void delete(Object remove);
    
    public boolean isEmpty();
    
    public Object search(Object data);
    
    public List copy();
    
    public Object getFirst();
    
    public Object getLast();
    
    public int getSize();
    
}
