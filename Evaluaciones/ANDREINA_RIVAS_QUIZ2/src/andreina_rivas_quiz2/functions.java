/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreina_rivas_quiz2;

import java.util.Random;

/**
 *
 * @author andre
 */
public class functions {
    public static String print_excluded(String ex){
        String[] split = ex.split("\n");
        String print="";
        for(int i=0;i<split.length;i++){
            print+="#"+String.valueOf(i+1)+"\n";
            print+=split[i]+"\n"+"\n";
        }
        return print;
    }
    
    public static void reestart_create(){
        mainWindow.n_nodos.setText("");
        mainWindow.name_tree.setText("");
        mainWindow.preorder.setText("");
        mainWindow.excluded.setText("");
        mainWindow.jLabel8.setVisible(false);
        mainWindow.name_mix.setVisible(false);
       
       
    }
    
    public static boolean valid_name(Stack stack, String name){
        boolean valid=true;
        if(!stack.isEmpty()){
            NodoS aux = stack.pop();
            if(aux.getData().getName().equalsIgnoreCase(name)&&valid){
                valid=false;
            }if(valid){
            valid = valid_name(stack,name);}
            stack.push(aux.getData());
        }
        return valid;
    }
    
    public static Tree create_tree(String name, int n_nodos){
        Tree newT = new Tree(name);
        while(newT.getSize()<n_nodos){
            Nodo newNodo= new Nodo(random_num());
            newNodo.setName_og(name);
            newT.insert(newNodo, newT.getRoot());
        }
        
        return newT;
    }
    
    public static String print_merged(Tree tre){
        String[] content = tre.preorder(tre.getRoot()).split(" ");
        String printable="";
        for(int i=0;i<content.length;i++){
            Nodo f = tre.search(validate_number(content[i]), tre.getRoot());
            printable+="#"+String.valueOf(i+1)+"\n";
            printable+= "Valor: "+ content[i] +"\nPerteneciente a "+f.getName_og()+"\n"+"\n";
        }
        return printable;
    }
    
    public static void merge_forest(Stack stack){
        if(!stack.isEmpty()){
        if(stack.getSize()!=1){
            Tree result=merge_two(stack);
            stack.push(result);
            merge_forest(stack);
        }
        }
    }
    
    public static Tree get_oldest(Stack stack){
        if(!stack.isEmpty()){
            if(stack.getSize()!=1){
                NodoS aux = stack.pop();
                Tree tree = get_oldest(stack);
                stack.push(aux.getData());
                return tree;
            }else{
                return stack.getTop().getData();
            }
        }else{
            return null;
        }
    }
    
    public static Tree merge_two(Stack stack){
        Tree newest = stack.pop().getData();
        Tree oldest= stack.pop().getData();
        String[] content = newest.preorder(newest.getRoot()).split(" ");
        for(String con: content){
            int num = validate_number(con);
            Nodo found = oldest.search(num, oldest.getRoot());
            if(found==null){
                Nodo newN = new Nodo(num);
                newN.setName_og(newest.getName());
                oldest.insert(newN, oldest.getRoot());
            }else{
                if(!mainWindow.exclude.contains(con)){
                    mainWindow.exclude+="Valor: "+con+ "  perteneciente a: "+newest.getName()+"\n";
                }
            }
        }
        return oldest;
    }
    
    
    public static int random_num(){
        Random r = new Random();
        return r.nextInt(1, 1000);
    }
    public static int validate_number(String s){
        int num;
        try{
            num = Integer.parseInt(s);
        }catch(Exception e){
            num=-1;
        }
        return num;
    }
}
