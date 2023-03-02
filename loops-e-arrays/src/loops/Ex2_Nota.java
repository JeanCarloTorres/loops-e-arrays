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
public class Ex2_Nota {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Nota: ");
        nota = scan.nextInt();
        
        while(nota < 0 || nota > 10){
            System.out.println("Nota invalida!\n Digite novamente:");
            nota = scan.nextInt();
        }
    }
    
}
