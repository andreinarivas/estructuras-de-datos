/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microsoft.line;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import microsoft.line.parents.ListCD;
import microsoft.line.parents.Nodo;
import microsoft.line.parents.NodoD;
import microsoft.line.parents.PointerList;


/**
 *
 * @author andre
 */
public class functions {
    
    public static Call getSelCall(PointerList CallList, int id){
        Nodo aux = CallList.getFirst();
        Call data=null;
        boolean found =false;
        while(aux!=null && !found){
            data = (Call) aux.getData();
            int check = data.getId();
            if(check == id){
                found = true;
            }
            aux=aux.getNext();
        }
        return data;
    }
    
    public static Employee getSelEmployee(ListCD employees, String name){
        NodoD aux = (NodoD) employees.getFirst();
        Employee data;
        boolean found = false;
        do{
            data = (Employee) aux.getData();
            String check = data.getName();
            if (check.equals(name)){
                found =true;
            }
            aux=(NodoD) aux.getNext();
        }while(aux!=employees.getFirst() && !found);
        return data;
    }
    
    
    public static DefaultListModel getCalls(Employee employee){
        DefaultListModel result = new DefaultListModel();
        Nodo aux = employee.CallList.getFirst();
        while(aux!=null){
            Call data = (Call) aux.getData();
            result.addElement(Integer.toString(data.getId()));
            aux=aux.getNext();
        }
        return result;
    }
    
    public static DefaultListModel getEmployees(ListCD employees){
        DefaultListModel result = new DefaultListModel();
        NodoD aux = (NodoD) employees.getFirst();
        do{
            Employee data = (Employee) aux.getData();
            String name = data.getName();
            result.addElement(name);
            aux=(NodoD) aux.getNext();
        }while(aux!=employees.getFirst());
        return result;
    }
    
    public static Employee newEmployee(String name, String software, ListCD employees){
        if(!employees.isEmpty()){
        NodoD aux = (NodoD) employees.getFirst();
        int count = 0;
        do{
            Employee data= (Employee)aux.getData();
            if(data.getSoftware() == null ? software == null : data.getSoftware().equals(software)){
                count++;
            }
            aux=(NodoD) aux.getNext();
        }while(aux!=employees.getFirst());
        
        if(count<2){
            System.out.println(count);
            Employee newE = new Employee(name, software, 0);
            return newE;
        }}
        else{
            Employee newE = new Employee(name, software, 0);
            return newE;
        }
        return null;
    }
    
    public static int validateNum(String num){
        try{int i = Integer.parseInt(num);
        return i ;}
        catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Please enter a number");      
        return 0;
                    }
    }
    
    public static void NewCall(ListCD employees, String name, String software, int number, String problem){
        Call newCall = new Call(name, number, software, problem);
        getEmployee(employees, software, newCall);
        
        
    }
    
    public static boolean areEmployees(ListCD employees, String software){
        boolean exist=false;
        NodoD aux = (NodoD)employees.getFirst();
        do{
            Employee data = (Employee) aux.getData();
            if(data.getSoftware() == null ? software == null : data.getSoftware().equals(software)){
                exist=true;
            }
            aux=(NodoD) aux.getNext();
        }while(aux!= employees.getFirst());
        
        return exist;
    }
    
    public static void getEmployee(ListCD employees, String software, Call call){
        if(areEmployees(employees,software)){
        NodoD aux = (NodoD) employees.getFirst();
        int count = 0;
        boolean assigned=false;
        Employee given=null;
        int times =0;
        while(assigned==false && count<2){
        do{
            Employee data= (Employee)aux.getData();
            if(data.getSoftware() == null ? software == null : data.getSoftware().equals(software)){
                if(data.getnCalls()<8){
                    data.CallList.addAtEnd(call);
                    assigned=true;
                    given=data;
                }
                else{
                    count++;
                }
            }
            aux=(NodoD) aux.getNext();
        }while(aux!=employees.getFirst());
        }
        
        if(given!=null){
            JOptionPane.showMessageDialog(null, "Call Assigned");
            given.CallList.print();
        }  else{
        JOptionPane.showMessageDialog(null, "Max calls for software reached"); 
        }}
        else{
        JOptionPane.showMessageDialog(null, "ERROR: No employees");}}
}
