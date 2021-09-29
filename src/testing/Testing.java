/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import java.util.Scanner;

/**
 * Lawrence: to print"Hello world" Date:07 Seps 2021
 * Date: 07 Sep 2021
 * @author Cheng Man Hon
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please Enter you Name : ");
        String name = s.next();
        
        System.out.print("Please Enter your Price : ");
        Double price = s.nextDouble();
        
        System.out.print("Please Enter your Price2 : ");
        Double price2 = s.nextDouble();
                
        if(price > price2){
            System.out.print(name + " price 大過 price2");

        }else{System.out.print(name + " price 小過 price2");
    
            }

        };
                
    }


