package Loops;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Ex1_NomeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) { //continua executando ate que tenha um break

            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            
            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Meu nome é " + nome + " e tenho " + idade + " de idade");
        }
        
    }

}
