/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;

/**
 *
 * @author Mataia
 */
import java.io.*;
import java.lang.*;
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=0; 
            try{
                BufferedReader brl = new  BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Radius of Circle : ");
                r = Integer.parseInt(brl.readLine());
                double area = Math.PI*r ;
                System.out.println("Area of Circle : "+area) ;
                double perimeter =2*Math.PI*r ;
                System.out.println("perimeter of Circle : "+perimeter);
                
                
                
                
                
            }
            catch(Exception e){
            System.out.println("Error : "+e);
            }
    }
    
}
