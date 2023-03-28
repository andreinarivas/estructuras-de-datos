/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.clase;

/**
 *
 * @author andre
 */
public class ProblemaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        organize organize = new organize();
        int[] array ={7,2,4,5,3,1,25,9,8,22,10,11};
        for (int i =0; i<12; i++){
            NodoP newNodo = new NodoP(array[i]);
            queue.queue(newNodo);
        }
        
        queue.print();
        organize.organize(queue);
        System.out.println("\n");
        queue.print();
        

    }
    
}
