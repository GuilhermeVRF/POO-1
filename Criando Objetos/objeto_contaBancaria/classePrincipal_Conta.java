/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objeto_contaBancaria;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class classePrincipal_Conta {

    public static void consultarContas( ArrayList<Conta> lista){
        for(int pos_Conta = 0; pos_Conta < lista.size();pos_Conta++){
           System.out.println((pos_Conta + 1) + " - "+ lista.get(pos_Conta).getTitular().getNome());
        }
    }    
    public static void consultarClientes( ArrayList<Cliente> lista){
        for(int pos_Conta = 0; pos_Conta < lista.size();pos_Conta++){
           System.out.println((pos_Conta + 1) + " - "+ lista.get(pos_Conta).getNome());    
        }
    }    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int acaoMenu, opcaoMenu, contaDestinataria;
        int contID_Conta = 1, contID_Cliente = 1;
        int indiceListaCliente = 0, indiceListaConta = 0;
        ArrayList<Cliente> listaClientes = new ArrayList();
        ArrayList<Conta> listaContas = new ArrayList();

        Cliente CL1 = new Cliente();
        
        System.out.println("--Banco do Brasil--\n1.Cadastrar cliente\n2.Criar Conta\n3.Consultar clientes\n4.Sair");
        do{
            System.out.print("Opção: ");
            opcaoMenu = Teclado.nextInt();
            Teclado.nextLine();
            
            switch(opcaoMenu){
                case 1:
           
                    listaClientes.add(new Cliente());
                    listaClientes.get(indiceListaCliente).setID(contID_Cliente);
                    System.out.println("Conta criada! ID: "+ contID_Cliente++);
                    
                    System.out.print("Informe o nome do cliente: ");
                    listaClientes.get(indiceListaCliente).setNome(Teclado.nextLine());
                    
                    System.out.print("Informe o CPF do cliente: ");
                    listaClientes.get(indiceListaCliente).setCPF(Teclado.nextLine());
                    
                    System.out.print("Informe o endereço do cliente: ");
                    listaClientes.get(indiceListaCliente).setEndereco(Teclado.nextLine());
                    
                    System.out.print("Informe o telefone do cliente: ");
                    listaClientes.get(indiceListaCliente).setTelefone(Teclado.nextLine());
                    
                    indiceListaCliente++;
                    break;
                    
                case 2:
                    listaContas.add(new Conta());
                    listaContas.get(indiceListaConta).setNumeroID(contID_Conta);
                    System.out.println("Conta criada! ID: "+ contID_Conta++);
                    
                    System.out.print("Deseja vincular um cliente a essa conta? ");
                    
                    switch(Teclado.next()){
                        case "Sim":
                            for(int pos_Cliente = 0; pos_Cliente < listaClientes.size();pos_Cliente++){
                                System.out.println((pos_Cliente + 1) + " - "+ listaClientes.get(pos_Cliente).getNome());
                            }
                            System.out.print("Insira o ID do cliente que deseja adicionar a conta: ");
                            acaoMenu = Teclado.nextInt();
                            listaContas.get(indiceListaConta).setCliente(listaClientes.get(acaoMenu - 1));
                            break;
                            
                        case "Não!":
                            System.out.print("A conta "+ listaContas.get(indiceListaConta).getNumeroID()+ "não tem um cliente vinculado!");
                            break;
                    }
                    System.out.print("Informe o saldo dessa conta: R$");
                    listaContas.get(indiceListaConta).setSaldo(Teclado.nextDouble());
                    indiceListaConta++;
                    break;
                case 3:
                    consultarClientes(listaClientes);
            }
        }while(opcaoMenu != 4);
        
        System.out.println("---Transações do banco---");
        System.out.println("1.Consultar saldo\n2.Sacar\n3.Depositar\n4.Transferir\n5.Sair");
        
        do{
            System.out.print("Opção: ");
            opcaoMenu = Teclado.nextInt();
            
            switch(opcaoMenu){
                case 1:
                    
                    consultarContas(listaContas);
                    
                    System.out.print("Conta a consultar: ");
                    acaoMenu = Teclado.nextInt();
                    if(acaoMenu <= listaContas.size()){
                        listaContas.get(acaoMenu - 1).consultarSaldo();
                    }else{
                        System.out.println("Essa conta não existe!");
                    }
                    break;
                case 2:
                    consultarContas(listaContas);
                    System.out.print("Conta a sacar: ");
                    acaoMenu = Teclado.nextInt();
                    
                    if(acaoMenu <= listaContas.size()){
                        System.out.print("Valor a sacar: ");
                        listaContas.get(acaoMenu - 1).sacarValor(Teclado.nextDouble());
                    }else{
                         System.out.println("Essa conta não existe!");
                    }
                    break;
                case 3:
                    consultarContas(listaContas);
                    System.out.print("Conta a depositar: ");
                    acaoMenu = Teclado.nextInt();
                    
                    if(acaoMenu <= listaContas.size()){
                         System.out.print("Valor a depositar: ");
                        listaContas.get(acaoMenu - 1).depositarValor(Teclado.nextDouble());
                    }
                    break;
                case 4:
                    consultarContas(listaContas);
                    System.out.print("Conta remetente: ");
                    acaoMenu = Teclado.nextInt();
                    
                    System.out.print("Conta destinataria: ");
                    contaDestinataria = Teclado.nextInt();
                    
                    if(acaoMenu <= listaContas.size() && contaDestinataria <= listaContas.size()){
                        System.out.println("Valor a transferir para "+ listaContas.get(contaDestinataria - 1).getTitular().getNome()+": ");
                        listaContas.get(acaoMenu - 1).transferirValor(listaContas.get(contaDestinataria - 1), Teclado.nextDouble());
                    }
            }
            
        }while(opcaoMenu != 5);
    }    
}
