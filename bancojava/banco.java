package live2604;

import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("!!!  Bom Dia Cliente  !!!\n");
        
        System.out.println("\nQual Seu Nome?\n");
        String nome = scanner.nextLine();
        
        System.out.println("\nSeja Bemvindo ao Banco:" + " " + nome + ".\n");
        
        System.out.println("Qual sera seu saldo inicial ? \n");
        double saldoconta = scanner.nextDouble();
         
        int opcao = 0;  
        while (opcao != 4){  
            System.out.println("\n Selecione a opcao que deseja prosseguir : \n");
            System.out.println("1 - SAQUE\n");
            System.out.println("2 - DEPOSITO\n");
            System.out.println("3 - EXIBIR SALDO \n");
            System.out.println("4 - FINALIZAR E SAIR\n");
         
            opcao = scanner.nextInt();
         
            switch (opcao) {
                case 1:
                    System.out.println("Qual valor deseja sacar ? \n");
                    double saque = scanner.nextDouble();
                    if (saque > saldoconta) {
                        System.out.println("Valor insuficiente na conta,Tente novamente.\n");
                    } else {
                        saldoconta -= saque;
                        System.out.println("Saque de " + "R$" + saque + " foi realizado com sucesso.\n\nSeu saldo atualizado e de :" + "R$" + saldoconta);
                    }
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar ?\n");
                    double deposito = scanner.nextDouble();
                    saldoconta += deposito;
                    System.out.println("Deposito de " + "R$" + deposito + " foi realizado com sucesso.\n\nSeu saldo atualizado e de :" + "R$" + saldoconta);
                    break;
                case 3:
                    System.out.println("Seu saldo e de :" + "R$" + saldoconta);
                    break;
                case 4:
                    System.out.println("!!! SISTEMA ENCERRADO E PROGAMA FINALIZADO !!!");
                    break;
                default: 
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}