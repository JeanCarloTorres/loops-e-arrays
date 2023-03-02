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
public class Ex3_MaiorEMEdia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        
        int count = 0;
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            
            soma = soma + numero;
            
            if(numero > maior) maior = numero;
            
            count++;
            
        }while(count < 5);
       
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
