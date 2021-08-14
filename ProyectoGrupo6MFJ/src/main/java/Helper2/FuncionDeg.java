/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper2;

/**
 *
 * @author jun frncico
 */
public class FuncionDeg extends PTrigono{

    public FuncionDeg() {
    }

    @Override
    public double funcionTrigono(int funcion, double num1) {
       double num2=180;
    switch(funcion){
            case 1 ->num1=(Math.sin(Math.PI*(num1)/180));
            
            case 2 -> num1=(Math.asin(num1)*num2/Math.PI);
            
            case 3 -> num1=(Math.cos(Math.PI*(num1)/180));
            
            case 4 -> num1=(Math.acos(num1)*num2/Math.PI);
            
            case 5 -> num1=(Math.tan(Math.PI*(num1)/180));
            
            case 6 -> num1=(Math.atan(num1)*num2/Math.PI);
        }    
         return num1;  
    
    }
    }
    

        