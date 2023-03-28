/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivas_parcial1;

/**
 *
 * @author andre
 */
public class solucion {
    
     public static void invertir_con_vacia(List list1, List list2){
        if(!list1.isEmpty()){
            Nodo aux = list1.getFirst();
            while(aux!=null){
               list2.addFirst(aux.getData());
               aux=aux.getNext();
            }  
        } 
    }
     
    public static void invertir_con_cabeza(List list1){
        Nodo ins, bef;
        if(!list1.isEmpty()){
            int count = 1;
            int times = list1.getSize();
            ins = list1.getLast();
            list1.delete(ins.getData());
            list1.addFirst(ins.getData());
            bef=list1.getFirst();
            while(count<times){
                ins = list1.getLast();
                list1.delete(ins.getData());
                list1.insert_between(bef,ins);
                bef=ins;
                count++;
            }
        }
    }
     
    public static void invertir_recursivo(List list1){
        if(!list1.isEmpty()){
            Nodo aux = list1.getFirst();
            list1.delete(aux.getData());
            invertir_recursivo(list1);
            list1.insert_with_last(aux.getData());
        }
    }
}
