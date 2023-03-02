/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author autologon
 */
public class Ex1_OrdemInversa {
    
    public static void main(String[] args) {
        int[] vetor = {0, -8, 12, 77, 9, 6};
        
        //System.out.println(vetor.length);
        
        System.out.println("Vetor: ");
        int count = 0;;
        while(count < (vetor.length)){
            
            System.out.print(vetor[count] + " ");
            count++;
            
        }
        System.out.println("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
