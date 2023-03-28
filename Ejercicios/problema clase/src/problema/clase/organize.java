/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.clase;

/**
 *
 * @author andre
 */
public class organize {
    
 
    public void organize(Queue queue){
        if(!queue.isEmpty()){
            int size = queue.getSize();
            NodoP max = queue.getFront();
            NodoP aux;
            int count=0;
            while(count<size){
                aux=queue.getFront();
                queue.dequeue();
                aux.setNext(null);
                if(aux.getData()>max.getData()){
                    queue.queue(max);
                    max=aux;}
                else if(aux.getData()<max.getData()){
                    queue.queue(aux);
                }
                else{
                    max=aux;
                }
                count++;   
            } 
            organize(queue);
            queue.queue(max);
        }
    }
           
    }

