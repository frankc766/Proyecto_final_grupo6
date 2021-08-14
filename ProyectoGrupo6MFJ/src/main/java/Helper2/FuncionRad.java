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
public class FuncionRad extends PTrigono {

    @Override
    public double funcionTrigono(int funcion, double num1) {
      switch(funcion){
            case 1 -> num1=(Math.sin(num1));
            
            case 2 -> num1=(Math.asin(num1));
            
            case 3 -> num1=(Math.cos(num1));
            
            case 4 -> num1=(Math.acos(num1));
            
             case 5 -> num1=(Math.tan(num1));
            
            case 6 -> num1=(Math.atan(num1)); 
        }
        
        return num1;  
    }
    
}
