/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Guillen
 */
public class Lista {
     private Nodo pFirst;
 //private Nodo pLast;
 private String nombre;
 private int iN;


 public Lista(String s){
    pFirst=null;
    // pLast=null;
    nombre=s;
    iN=0;
 }
 public int Numero_nodos(){
    return iN;
 }
 public boolean esVacio(){
    return pFirst==null;
 }
 public Nodo primero(){
    return pFirst;
 }
 public Nodo próximo(Nodo pValor){
    if (pValor!=null){
        pValor=pValor.pnext;
        return pValor;
    }else{
    return null;
    }
 }
 public Object leer(Nodo pValor){
    return pValor.data;
 }
 public void insertar(Object x, Nodo pValor){
    Nodo pNew=new Nodo(x);
    if (esVacio()){
         pFirst=pNew;
    }else{
        pNew.pnext=pValor.pnext;
        pValor.pnext=pNew;
    }
 iN++;
 }

 public void recorrer(){
    Nodo pAux;
        if (esVacio()){
            System.out.println(nombre +" está vacía");

        }else{
            pAux=pFirst;
            while(pAux!= null){
                System.out.println(pAux.data.toString()+", ");
                pAux=próximo(pAux);
                //pAux=pAux.pnext;
            }
        }
 }

}
