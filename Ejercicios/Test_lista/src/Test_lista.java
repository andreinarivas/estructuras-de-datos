/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Christian Guillen
 */
public class Test_lista {

    static public void Imprimir_Inverso(Lista L, Nodo Aux){
        Object elem;
        if (Aux !=null) {
            elem=L.leer(Aux);
             Imprimir_Inverso(L,Aux.pnext);
             System.out.println(elem.toString());
        }
               
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista=new Lista("prueba");
 Nodo posicion;
 //Se crean los elementos que se guardarán en la lista.
 Boolean b=new Boolean (true);
 Character g=new Character('@');
 Integer alfa=new Integer(8956);
 String palabra= new String("Hola");
 //usamos los métodos implementados.
 miLista.recorrer();
 posicion=miLista.primero();
 //System.out.println(posicion.toString());
 miLista.insertar(b, posicion);
 miLista.recorrer();
 posicion=miLista.primero();
 System.out.println(posicion.toString());
 miLista.insertar(g, posicion);
 posicion=miLista.próximo(posicion);
 System.out.println(posicion.toString());
 miLista.insertar(alfa, posicion);
 posicion=miLista.próximo(posicion);
 miLista.insertar(palabra, posicion);
 System.out.println(posicion.toString());
 posicion=miLista.próximo(posicion);
 System.out.println(posicion.toString());
 // posicion=miLista.próximo(posicion);
 //System.out.println(posicion.toString());
 miLista.recorrer();
 System.out.println("La cantidad de elementos es: "+miLista.Numero_nodos());
 Nodo aux=miLista.primero();
 Imprimir_Inverso(miLista,aux);
    }
    
}
