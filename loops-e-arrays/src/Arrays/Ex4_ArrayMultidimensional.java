/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Random;

/**
 *
 * @author autologon
 */
public class Ex4_ArrayMultidimensional {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] M = new int[4][4];
        
        for(int i = 0; i < M.length;i++){
            for(int j = 0; j < M[1].length;j++){
            M[i][j] = random.nextInt(9);
        }
        }
        for( int[] linha : M  ){
            for(int elementoDaColuna : linha ){
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
    
}
