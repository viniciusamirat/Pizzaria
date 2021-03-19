/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.util.Scanner;

/**
 *
 * @author Marcilene
 */
public class Biblioteca {
    public static void separador(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void pedir(){
        Scanner opc = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        Scanner reais = new Scanner(System.in);
        
        String pizza = "", endereco, nome, telefone, pagamento = "", tempo = "";
        int opcao, correto = 2;
        float valor = 0, dinheiro = 0, troco = 0;
        
        while (correto == 2){
            System.out.println("\n1- À MODA DA CASA ----- R$44,00");
            System.out.println("2- ALICHE ------------- R$35,00");
            System.out.println("3- BAURÚ -------------- R$34,00");
            System.out.println("4- BAIANA ------------- R$37,00");
            System.out.println("5- BRASILEIRA --------- R$40,00");
            System.out.println("6- PARAGUAIA ---------- R$42,00");
            System.out.println("7- PORTUGUESA --------- R$39,00");
            System.out.println("8- VEGETARIANA -------- R$40,00");
            System.out.println("9- FRANGO C/ CATUPIRY - R$38,00\n");

            System.out.print("Digite o número da pizza escolhida: ");
            opcao = opc.nextInt();
            separador();
            
            //Aqui são feitas as atribuições para as variaveis conforme a opção escolhida
            switch (opcao){
                case 1:
                    pizza = "À MODA DA CASA";
                    tempo = "50";
                    valor = 44.00f;
                break;
                case 2:
                    pizza = "ALICHE";
                    tempo = "40";
                    valor = 35.00f;
                break;
                case 3:
                    pizza = "BAURÚ";
                    tempo = "35";
                    valor = 34.00f;
                break;
                case 4:
                    pizza = "BAIANA";
                    tempo = "50";
                    valor = 37.00f;
                break;
                case 5:
                    pizza = "BRASILEIRA";
                    tempo = "45";
                    valor = 40.00f;
                break;
                case 6:
                    pizza = "PARAGUAIA";
                    tempo = "40";
                    valor = 42.00f;
                break;
                case 7:
                    pizza = "PORTUGUESA";
                    tempo = "45";
                    valor = 39.00f;
                break;
                case 8:
                    pizza = "VEGETARIANA";
                    tempo = "50";
                    valor = 40.00f;
                break;
                case 9:
                    pizza = "FRANGO C/ CATUPIRY";
                    tempo = "40";
                    valor = 38.00f;
                break;
            }
            
            //confirmação da escolha
            System.out.println("\nVocê escolheu a pizza " + pizza + " correto?");
            System.out.println("1- Sim \n2- Não");
            System.out.print("Resposta: ");
            correto = opc.nextInt();
            separador();
        }
        
        //Dados do cliente
        System.out.println("\nQual seu nome?");
        nome = texto.nextLine();
        System.out.println("\nQual seu endereço?");
        endereco = texto.nextLine();
        System.out.println("\nQual seu telefone para contato?");
        telefone = texto.nextLine();
        separador();
        
        System.out.print("\n-Qual a forma de pagamento?\n"
                    + "1- Dinheiro.\n"
                    + "2- Cartão de crédito.\n"
                    + "3- Cartão de débito.\n"
                    + "\nDigite o número da opção escolhida: ");
        opcao = opc.nextInt();
        separador();
        
        //Referente a forma de pagamento e a necessidade de troco
        switch (opcao){
            case 1:
                pagamento = "DINHEIRO";
                System.out.print("\n-Você vai precisar de troco?\n"
                            + "1- Sim\n"
                            + "2- Não\n"
                            + "\nDigite o número da opção escolhida: ");
                opcao = opc.nextInt();
                
                if (opcao == 1) {
                    while (correto == 1){
                        System.out.print("\n-Troco para quanto?: R$ ");
                        dinheiro = reais.nextFloat();

                        if (dinheiro <= valor){
                            System.out.println("\n---Por favor insira um valor maior---"
                                    + " que o preço da pizza.");
                        } else {
                            troco = dinheiro - valor;
                            correto = 2;
                        }
                    }
                }
                separador();
            break;
            case 2:
                pagamento = "CARTÃO DE CRÉDITO";
            break;
            case 3:
                pagamento = "CARTÃO DE DÉBITO";
            break;
        }
        
        //Amostragem do resumo do pedido para o cliente
        System.out.println("\n\n---RESUMO DO PEDIDO---\n");
        System.out.println("Pizza: " + pizza);
        System.out.println("Seu nome: " + nome);
        System.out.println("Seu endereço: " + endereco);
        System.out.println("Seu telefone: " + telefone);
        System.out.println("Forma de pagamento: " + pagamento);
        System.out.printf("Preço da pizza: R$ %.2f \n", valor);
        if (troco != 0){
            System.out.printf("Valor disponibilizado: R$ %.2f \n", dinheiro);
            System.out.printf("Troco: R$ %.2f \n", troco);
        }

        System.out.println("\nSeu pedido será entregue em "
                + "aproximadamente " + tempo + " minutos!\n");
        
        System.out.println("Obrigado pela preferência!!!");
    }
    
}
