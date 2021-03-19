/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.util.Scanner;
import static pizzaria.Biblioteca.*;

/**
 *
 * @author Vinícius Amirat
 */
public class Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0, opcao;
        Scanner resOpc = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Bem-vindo(a) a pizzaria Amirat!");
        
        while (contador == 0){
            System.out.print("\n-O que você deseja fazer?\n"
                    + "1- Ver o cardápio e fazer um pedido.\n"
                    + "2- Sair.\n\n"
                    + "Digite o número da opção escolhida: ");
            opcao = resOpc.nextInt();
            separador();
            
            switch (opcao){
                case 1:
                    pedir();
                    System.out.println("\nTecle ENTER para voltar ao menu.");
                    leia.nextLine();
                    separador();
                break;
                case 2:
                    System.exit(0);
                break;
                default:
                    System.out.println("ERROR: Digite uma opção existente!");
            }
        }
        
    }
    
}
