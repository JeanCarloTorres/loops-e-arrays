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
public class Ex5_Tabuada {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabuada de " + tabuada);
        
        for(int i = 1 ; i <= 100 ;i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
