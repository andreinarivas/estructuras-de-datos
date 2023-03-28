/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author andre
 */
public class auxiliars {
    int number;

    public auxiliars(String numS) {
        number = Integer.parseInt(numS);
        
    }
    
    public String GetFactorial(){
        return Integer.toString(factorial(number));
    }
    
    public int factorial(int number){
        if (number>=1){
            return number*factorial(number-1);
        }
        else{ return 1;}    
    }
    
    public String IsPrime(){
        
        int divisors=0;
        for (int i=1; i<number+1; i++){
            if (number%i==0){
                divisors++;
            }
        }
      
        if (divisors<=2){
            return "The number "+Integer.toString(number)+" is prime";
        }
        else{ 
            return "The number "+Integer.toString(number)+" is not prime";
        }
    }
    
    public String IsPerfect(){
        int divisors=0;
        for (int i=1; i<number; i++){
            if (number%i==0){
                divisors+=i;
            }
        }
        
        if (divisors==number){
            return "The number "+Integer.toString(number)+" is perfect";
        }
        else if (divisors>number){
            return "The number "+Integer.toString(number)+" is abundant";
        }
        else{
            return "The number "+Integer.toString(number)+" is deficient";
        }
    }
    
    public String IsEven(){
        if (number%2!=0){
            return "The number "+Integer.toString(number)+" is odd";
        }
        else {
            return "The number "+Integer.toString(number)+" is even";
        }
    }
}


