/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos.objeto_contaBancaria;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author guilh
 */
public class classePrincipal_Conta {

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int opcaoMenu;
        int contID_Conta = 0, contID_Cliente = 0;        
        ArrayList<Cliente> listaClientes = new ArrayList();
        ArrayList<Conta> listaContas = new ArrayList();

        System.out.println("--Área de clientes--\n1.Cadastrar cliente\n2.Consultar clientes\n3.Atualizar cliente\n4.Sair");
        do {
            System.out.print("Op��o: ");
            opcaoMenu = Teclado.nextInt();
            Teclado.nextLine();

            switch (opcaoMenu) {
                case 1:
                    Objetos.objeto_contaBancaria.metodosBanco.cadastrarClientes(listaClientes, Teclado, ++contID_Cliente);
                    break;

                case 2:
                    if(!listaClientes.isEmpty()){
                        Objetos.objeto_contaBancaria.metodosBanco.consultarCliente(listaClientes, Teclado);
                    }else{
                        Objetos.objeto_contaBancaria.metodosBanco.semCadastros();
                    }         
                    break;

                case 3:
                    if(!listaClientes.isEmpty()){
                                           
                    int indiceCliente = Objetos.objeto_contaBancaria.metodosBanco.consultarCliente(listaClientes, Teclado);

                    if(indiceCliente >= 0){//Se a senha informada estiver incorreta o método consultarCliente retorna -1
                        Objetos.objeto_contaBancaria.metodosBanco.atualizarCliente(listaClientes, Teclado, indiceCliente);
                    }
                    
                    }else{
                        Objetos.objeto_contaBancaria.metodosBanco.semCadastros();
                    }
                    break;
            }
        } while (opcaoMenu != 4);

        System.out.println("--Área de contas--\n1.Cadastrar contas\n2.Consultar contas\n3.Atualizar contas\n4.Sair");

        do {
            System.out.print("Opção: ");
            opcaoMenu = Teclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    Objetos.objeto_contaBancaria.metodosBanco.cadastrarConta(listaContas, listaClientes, Teclado, ++contID_Conta);     
                break;
                    
                case 2:
                    if(!listaContas.isEmpty()){
                        Objetos.objeto_contaBancaria.metodosBanco.consultarConta(listaContas,Teclado);
                    }else{
                        Objetos.objeto_contaBancaria.metodosBanco.semCadastros();
                    }
                    
                break;
                
                case 3:
                    if(!listaContas.isEmpty()){
                        int indiceConta = Objetos.objeto_contaBancaria.metodosBanco.consultarConta(listaContas,Teclado);
                        Teclado.nextLine();
                        Objetos.objeto_contaBancaria.metodosBanco.atualizarConta(listaContas, listaClientes, Teclado, indiceConta);
                    }else{
                        Objetos.objeto_contaBancaria.metodosBanco.semCadastros();
                    }           
            }
        } while (opcaoMenu != 4);
        
        if(!listaContas.isEmpty()){
        
            System.out.println("--Área de transações--\n1.Consultar saldo\n2.Sacar\n3.Depositar\n4Transferir\n5.Sair.");
            do{
                int indiceConta;
                String CPF;
                System.out.print("Opção: ");
                opcaoMenu = Teclado.nextInt();
                Teclado.nextLine();


                switch(opcaoMenu){
                    case 1:
                        CPF = Objetos.objeto_contaBancaria.metodosBanco.formataCPF(Teclado);

                        indiceConta = Objetos.objeto_contaBancaria.metodosBanco.buscaConta_porCPF(listaContas, CPF, listaContas.size() - 1);

                        if(Objetos.objeto_contaBancaria.metodosBanco.validaSenha_Conta(listaContas, indiceConta, Teclado)){
                            listaContas.get(indiceConta).consultarSaldo();
                        }else{
                            System.out.println("Não foi possivel consultar o saldo da Conta "+ listaContas.get(indiceConta).getTitular().getNome());
                        }
                    break;  

                    case 2:
                        CPF = Objetos.objeto_contaBancaria.metodosBanco.formataCPF(Teclado);

                        indiceConta = Objetos.objeto_contaBancaria.metodosBanco.buscaConta_porCPF(listaContas, CPF, listaContas.size() - 1);

                        if(indiceConta != -1){
                            if(Objetos.objeto_contaBancaria.metodosBanco.validaSenha_Conta(listaContas, indiceConta, Teclado)){
                                System.out.print("Informe o valor a sacar: R$");
                                listaContas.get(indiceConta).sacarValor(Teclado.nextDouble());
                            }
                        }
                    break; 

                    case 3:
                        CPF = Objetos.objeto_contaBancaria.metodosBanco.formataCPF(Teclado);

                        indiceConta = Objetos.objeto_contaBancaria.metodosBanco.buscaConta_porCPF(listaContas, CPF, listaContas.size() - 1);
                        if(indiceConta != -1){
                            if(Objetos.objeto_contaBancaria.metodosBanco.validaSenha_Conta(listaContas, indiceConta, Teclado)){
                                System.out.print("Informe o valor a depositar: R$");
                                listaContas.get(indiceConta).depositarValor(Teclado.nextDouble());
                            }   
                        }    
                    break;    

                    case 4:
                        CPF = Objetos.objeto_contaBancaria.metodosBanco.formataCPF(Teclado);

                        indiceConta = Objetos.objeto_contaBancaria.metodosBanco.buscaConta_porCPF(listaContas, CPF, listaContas.size() - 1);

                        if(Objetos.objeto_contaBancaria.metodosBanco.validaSenha_Conta(listaContas, indiceConta, Teclado)){
                            Objetos.objeto_contaBancaria.metodosBanco.consultarContas(listaContas, listaContas.size() - 1, indiceConta);

                            System.out.print("Transferir para a conta: ");
                            int contaDestinataria = Teclado.nextInt() - 1;

                            if(contaDestinataria == indiceConta){
                                System.out.println("Não é possivel realizar transferência para uma mesma Conta!");
                            }else{
                                System.out.print("Valor a transferir: R$");
                                listaContas.get(indiceConta).transferirValor(listaContas.get(contaDestinataria), Teclado.nextDouble());
                            }                                           
                        }
                    break;
                }            

            }while(opcaoMenu != 5);
        }
    }
}
