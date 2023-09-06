/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objeto_contaBancaria;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class classePrincipal_Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int opcaoMenu, acaoMenu;
        Conta C1 = new Conta();
        Conta C2 = new Conta();
        
        System.out.print("Informe o número de identificação da conta: ");
        C1.setNumeroID(Teclado.nextInt());
        
        System.out.print("Informe o titular da conta: ");
        C1.setTitular(Teclado.next());
        
        System.out.print("Informe o saldo da conta: R$");
        C1.setSaldo(Teclado.nextDouble());
        
        
        System.out.print("Informe o número de identificação da conta: ");
        C2.setNumeroID(Teclado.nextInt());
        
        System.out.print("Informe o titular da conta: ");
        C2.setTitular(Teclado.next());
        
        System.out.print("Informe o saldo da conta: R$");
        C2.setSaldo(Teclado.nextDouble());
        
        
        System.out.println("---Menu Banco---\n1. Consultar saldo\n2.Sacar valor\n3.Depositar valor\n4.Transferir valor\n5.Sair");
        
        do{
            System.out.print("Opção desejada: ");
            opcaoMenu = Teclado.nextInt();
            
            switch(opcaoMenu){
                case 1:
                    C1.consultarSaldo();
                break;
                
                case 2:
                    System.out.print("Valor a sacar: R$");
                    acaoMenu = Teclado.nextInt();
                    C1.sacarValor(acaoMenu);
                    if(C1.sacarValor(acaoMenu)){
                        System.out.println("Saque efetuado de R$"+ acaoMenu);
                    }else{
                        System.out.println("Saldo insuficiente para o saque!");
                    }
                break;   
                
                case 3:
                    System.out.print("Valor a depositar: R$");
                    acaoMenu = Teclado.nextInt();
                    C1.depositarValor(acaoMenu);
                break;
                
                case 4:
                    System.out.print("Valor a transferir: R$");
                    acaoMenu = Teclado.nextInt();
                    C1.transferirValor(C2, acaoMenu);
                    
            }
        
        }while(opcaoMenu != 5);
    }
    
}
