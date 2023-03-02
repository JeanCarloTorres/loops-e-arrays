/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Ex2_Consoantes {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        
        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            
            if((letra.equalsIgnoreCase("a") | //IgnoreCase - ignora se a letra é maiscula ou minuscula
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
              
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            
            count++;
                
                    
            
        }while(count < consoantes.length);
        
        System.out.println("Consoantes: ");
        for ( String consoante : consoantes ){
            if (consoante != null)
            System.out.print(consoante + " ");
        }
        
        System.out.print("quantidade de consoantes: " + quantidadeConsoantes);
    }
}
