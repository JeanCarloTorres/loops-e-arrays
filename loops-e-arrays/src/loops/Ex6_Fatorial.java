/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Ex6_Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        
        int multiplicacao = 1;
        
        System.out.println(fatorial + "! = ");
        for(int i = fatorial ; i >= 1 ; i-- ){
            multiplicacao = multiplicacao * i;  
        }
        
        System.out.println(multiplicacao);
    }
}
