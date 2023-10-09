/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.objeto_contaBancaria;

import java.util.ArrayList;
import java.util.Scanner;
//Importando a classe Cliente e Conta
import objetos.objeto_contaBancaria.Cliente;
import objetos.objeto_contaBancaria.Conta;

/**
 *
 * @author Ana Paula
 */
public class metodosBanco {

    //Método para criar um novo cliente
    public static void cadastrarClientes(ArrayList<Cliente> lista, Scanner Teclado, int contID_Cliente) {
        System.out.println("ID do cliente: " + contID_Cliente);
        
        System.out.print("Informe o nome do cliente: ");
        String nome = Teclado.nextLine();
        
        String senha = criarSenha(Teclado, "Crie uma senha para o Cliente: ");
        
        System.out.print("Informe o CPF do cliente: ");
        String CPF = Teclado.nextLine();
        
        System.out.print("Informe o endere�o do cliente: ");
        String endereco = Teclado.nextLine();
        
        System.out.print("Informe o telefone do cliente: ");
        String telefone = Teclado.nextLine();
        
        lista.add(new Cliente(contID_Cliente, senha, nome, CPF, endereco, telefone));
    }

    //Método usado para criar ou atualizar senhas de Clientes e Contas
    public static String criarSenha(Scanner Teclado, String fraseSenha) {
        String senha, confirmarSenha;
        boolean senhasDiferentes = true;
        
        do {
            System.out.print(fraseSenha);
            senha = Teclado.nextLine();
            
            System.out.print("Escreve a senha novamente: ");
            confirmarSenha = Teclado.nextLine();
            
            if (!senha.equals(confirmarSenha)) {
                System.out.println("Senhas diferentes!");
                fraseSenha = "Informe uma senha novamente: ";
            } else {
                System.out.println("Senha criada!");
                senhasDiferentes = false;
            }
            
        } while (senhasDiferentes);
        
        return senha;
    }

    //Método usado para listar superficialmente todos os Clientes do banco
    public static void consultarClientes(ArrayList<Cliente> listaClientes, int indiceCliente) {
        if (indiceCliente == -1) {
            return;
        }        
        consultarClientes(listaClientes, indiceCliente - 1);
        System.out.println((indiceCliente + 1) + " - " + listaClientes.get(indiceCliente).getNome());        
    }

    //Método usado para consultar os dados de um Cliente cadastrado no banco
    public static int consultarCliente(ArrayList<Cliente> listaClientes, Scanner Teclado) {
        for (int pos_Conta = 0; pos_Conta < listaClientes.size(); pos_Conta++) {
            System.out.println((pos_Conta + 1) + " - " + listaClientes.get(pos_Conta).getNome());
        }
        
        System.out.print("Vizualizar dados do cliente:  ");
        int verCliente = Teclado.nextInt();
        Teclado.nextLine();
        
        if (validaSenha_Cliente(listaClientes, verCliente - 1, Teclado)) {
            System.out.println(listaClientes.get(verCliente - 1).toString());
            return verCliente - 1;
        } else {            
            return -1;
        }        
    }

    //Método usado para atualizar os dados de um Cliente
    public static void atualizarCliente(ArrayList<Cliente> listaClientes, Scanner Teclado, int ID_Cliente) {
        String acaoMenu;
        do {            
            System.out.print("Que dado voce deseja alterar do cliente " + listaClientes.get(ID_Cliente).getID() + "? ");
            acaoMenu = Teclado.nextLine();
            switch (acaoMenu) {
                case "Nome":
                    System.out.print("Informe o novo nome: ");
                    listaClientes.get(ID_Cliente).setNome(Teclado.nextLine());
                    break;
                
                case "Senha":
                    String novaSenha = criarSenha(Teclado, "Informe uma nova senha para ser atualizada: ");
                    listaClientes.get(ID_Cliente).setSenha(novaSenha);
                    break;
                
                case "CPF":
                    System.out.print("Informe o novo CPF: ");
                    listaClientes.get(ID_Cliente).setCPF(Teclado.nextLine());
                    break;
                
                case "Endereço":
                    System.out.print("Informe o novo endereço: ");
                    listaClientes.get(ID_Cliente).setEndereco(Teclado.nextLine());
                    break;
                
                case "Telefone":
                    System.out.print("Informe o novo telefone: ");
                    listaClientes.get(ID_Cliente).setTelefone(Teclado.nextLine());
                    break;
            }
        } while (!"Nenhum".equals(acaoMenu));
    }

    //Método usado para listar superficialmente todos as Contas do banco
    public static void consultarContas(ArrayList<Conta> listaContas, int indice, int indiceObjeto_corrente) {
        if (indice == - 1) {
            return;
        }
        consultarContas(listaContas, indice - 1, indiceObjeto_corrente);
        if(indice != indiceObjeto_corrente){
            System.out.println((indice + 1) + " - " + listaContas.get(indice).getTitular().getNome());  
        }             
    }

    //Método usado para consultar os dados de uma Conta cadastrada no banco
    public static int consultarConta(ArrayList<Conta> listaContas, Scanner Teclado) {
        for (int pos_Conta = 0; pos_Conta < listaContas.size(); pos_Conta++) {
            System.out.println((pos_Conta + 1) + " - " + listaContas.get(pos_Conta).getTitular().getNome());
        }
        
        System.out.print("Vizualizar dados da conta:  ");
        int verConta = Teclado.nextInt();
        System.out.println(listaContas.get(verConta - 1).toString());
        return verConta - 1;
    }
    //Esse sub-método verifica se o Cliente informado pelo usuário já está cadastrado em uma Conta
    private static boolean verificarSeClienteTemConta(ArrayList<Conta> listaContas, ArrayList<Cliente> listaClientes, int indiceConta, int indiceCliente){
        if(indiceConta == -1){
            return false;
        }
        if(listaContas.get(indiceConta).getTitular().getCPF().equals(listaClientes.get(indiceCliente).getCPF())){
            return true;
        }
        return verificarSeClienteTemConta(listaContas, listaClientes, indiceConta - 1, indiceCliente);
    }
    //Esse método cria uma nova Conta no Banco
    public static void cadastrarConta(ArrayList<Conta> listaContas, ArrayList<Cliente> listaClientes, Scanner Teclado, int contID_Conta) {
        int indiceCliente;
        System.out.println("ID da Conta: "+ contID_Conta);
        System.out.println("--Cadastro de Titular--\n1.Adicionar Titular existente\n2.Adicionar novo Titular\n3.Não adicionar Titular");
        System.out.print("Opção: ");
        int opcaoMenu = Teclado.nextInt();
        
        switch(opcaoMenu){
            case 1:
                if(!listaClientes.isEmpty()){
                    boolean clienteCadastrado;
                    do{
                        Objetos.objeto_contaBancaria.metodosBanco.consultarClientes(listaClientes, listaClientes.size() -  1);
                        System.out.print("Informe o indice do Titular que deseja adicionar: ");
                        indiceCliente = Teclado.nextInt() - 1;
                        Teclado.nextLine();
                        if(verificarSeClienteTemConta(listaContas, listaClientes, listaContas.size() - 1, indiceCliente)){
                            System.out.println("Esse cliente já está cadastrado em uma Conta!");
                            clienteCadastrado = true;
                        }else{
                            clienteCadastrado = false;
                        }
                    }while(clienteCadastrado);    
                }else{
                    Objetos.objeto_contaBancaria.metodosBanco.semCadastros();
                    System.out.println("1.Criar novo Titular\n2.Não adicionar Titular");
                    System.out.print("Opção: ");
                    opcaoMenu = Teclado.nextInt();
                    Teclado.nextLine();
                    indiceCliente = Objetos.objeto_contaBancaria.metodosBanco.cadastrarClienteForaDaLista_naConta(listaClientes, opcaoMenu + 1, Teclado);
                }
            break;    
                
            default:
                indiceCliente = Objetos.objeto_contaBancaria.metodosBanco.cadastrarClienteForaDaLista_naConta(listaClientes, opcaoMenu + 1, Teclado);
            break; 
                      
        }
        String senha = criarSenha(Teclado, "Informe uma senha para a Conta: ");
        listaContas.add(new Conta(contID_Conta, senha, listaClientes.get(indiceCliente)));
    }
    
    //Esse sub-método auxilia no cadastro de Clientes na Conta. Sendo útil para quando for necessário criar um novo Cliente para a Conta, ou quando a Conta não tiver um Cliente.
    private static int cadastrarClienteForaDaLista_naConta(ArrayList<Cliente> listaClientes, int opcaoMenu, Scanner Teclado){
        int indiceCliente;
        
        if(!listaClientes.isEmpty()){
            indiceCliente = listaClientes.get(listaClientes.size() - 1).getID();
        }else{
            indiceCliente = 0;
        }
          
        switch(opcaoMenu){
        case 2:
            Objetos.objeto_contaBancaria.metodosBanco.cadastrarClientes(listaClientes, Teclado, indiceCliente + 1);
        break;    

        case 3:
            listaClientes.add(new Cliente(indiceCliente + 1));
        break;    
        }
        return indiceCliente;    
    }

    //Método usado para atualizar os dados de uma Conta
    public static void atualizarConta(ArrayList<Conta> listaContas, ArrayList<Cliente> listaClientes, Scanner Teclado, int ID_Conta) {
        System.out.print("Deseja alterar qual dado da conta " + listaContas.get(ID_Conta).getNumeroID() + "? ");
        switch (Teclado.nextLine()) {
            case "Titular":
                Objetos.objeto_contaBancaria.metodosBanco.atualizarCliente(listaClientes, Teclado, listaContas.get(ID_Conta).getTitular().getID() - 1);
                break;
            
            case "Senha":
                String novaSenha = Objetos.objeto_contaBancaria.metodosBanco.criarSenha(Teclado, "Informe uma nova senha para a Conta: ");
                listaContas.get(ID_Conta).setSenha(novaSenha);
        }
    }
    //Esse método busca uma Conta no ArrayList com base no CPF informado pelo usuário. Caso encontre retorna o indice da Conta, caso contrário retorna -1.
    public static int buscaConta_porCPF(ArrayList<Conta> listaContas,String CPF ,int indiceConta){
        if(indiceConta == -1){
            return -1;
        }
        if(CPF.equals(listaContas.get(indiceConta).getTitular().getCPF())){
            return indiceConta;
        }
        return buscaConta_porCPF(listaContas, CPF, indiceConta - 1);
    }    
    //Método criado para checar a igualde entre uma senha informada pelo usuário e a senha de um Cliente
    private static boolean validaSenha_Cliente(ArrayList<Cliente> listaClientes, int indiceCliente, Scanner Teclado) {
        System.out.print("Informe a senha desse cliente: ");
        String senhaCliente = Teclado.nextLine();
        
        if (senhaCliente.equals(listaClientes.get(indiceCliente).getSenha())) {
            return true;
        } else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }
    public static boolean validaSenha_Conta(ArrayList<Conta> listaContas, int indiceConta, Scanner Teclado){
        System.out.print("Informe a senha dessa Conta: ");
        String senhaConta = Teclado.nextLine();
        
        if(senhaConta.equals(listaContas.get(indiceConta).getSenha())){
            return true;
        }else{
            System.out.println("Senha incorreta!");
            return false;
        }
    }
    public static String formataCPF(Scanner Teclado){
        System.out.print("Informe seu CPF: ");
        String CPF = Teclado.nextLine();
        
        if(CPF.length() == 11){
            CPF = CPF.substring(0,3) + "." + CPF.substring(3,6) + "." + CPF.substring(6,9) + "-" + CPF.substring(9,11);
        }else{
            System.out.print("Formato incorreto de CPF!");
        }
        return CPF;
    }
    //Método usado para quando ná nenhum Cliente ou Conta registrado no banco
    public static void semCadastros() {
        System.out.println("Não há registros!");
    }
}
