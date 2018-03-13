/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialwsclient;

import java.util.Scanner;

/**
 *
 * @author orlan
 */
public class FactorialWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el número al que desee calcular el factorial: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(); 
        System.out.println("El factorial de " + num1 + " es: " + factorial(num1));
    }

    
    /**
     * WEB SERVICES
     */
    private static int factorial(int arg0) {
        factorial.WSFactorial_Service service = new factorial.WSFactorial_Service();
        factorial.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(arg0);
    }
    
}
