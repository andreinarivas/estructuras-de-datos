/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rivas_parcial1;

/**
 *
 * @author andre
 */
public class RIVAS_PARCIAL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list1 = new List();
        List list2 = new List();
        for (int i=0; i<11;i++){
            list1.insert_with_last(i);
        }
       
        System.out.println("LISTA 1 SIN NADA");
        list1.print();
        
        System.out.println("LISTA 1 Y 2 CON PROBLEMA 1");
        solucion.invertir_con_vacia(list1, list2);
        System.out.println("LISTA 1");
        list1.print();
        System.out.println("LISTA 2");
        list2.print();
        
        System.out.println("LISTA 1 CON PROBLEMA 2");
        System.out.println("LISTA 1");
        list1.print();
        System.out.println("LISTA 1 SOLUCION");
        solucion.invertir_con_cabeza(list1);
        list1.print();
        
        System.out.println("LISTA 1 CON PROBLEMA 3");
        System.out.println("LISTA 1");
        list1.print();
        System.out.println("LISTA 1 SOLUCION");
        solucion.invertir_recursivo(list1);
        list1.print();
    }
    
}
