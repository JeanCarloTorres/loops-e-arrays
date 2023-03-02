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
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpar = 0;
        
        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();
        
        int count = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpar++;
            
            count++;
            
        }while(count < quantidadeNumeros);
        
        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Impar: " + quantidadeImpar);
    }
}
