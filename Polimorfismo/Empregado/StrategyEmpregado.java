/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado;

import Polimorfismo.Empregado.Colaboradores.Assalariado;
import Polimorfismo.Empregado.Colaboradores.Comissionado;
import Polimorfismo.Empregado.Colaboradores.Empregado;
import Polimorfismo.Empregado.Colaboradores.Horista;
import Polimorfismo.Empregado.Colaboradores.TotalVencimentos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class StrategyEmpregado {
    
    private static int opcaoMenu;
    private static double acaoMenu;
    private static ArrayList<Empregado> arrEmpregados = new ArrayList<>();
    private static Scanner Teclado = new Scanner(System.in);
    
    public static void rotina(){      
        do{
            System.out.println("---Gerenciamento de Empregados---");
            System.out.println("1. Adicionar");
            System.out.println("2. Atualizar");
            System.out.println("3. Apagar");
            System.out.println("4. Consultar");    
            System.out.println("5. Controle de gastos");  
            System.out.println("6. Sair");
            do{
                System.out.print("Opção:");
                opcaoMenu = Teclado.nextInt();Teclado.nextLine();
            }while(opcaoMenu < 1 || opcaoMenu > 6);
        
            switch (opcaoMenu){
                case 1:
                    adicionarEmpregado();
                break;
                
                case 2:
                    atualizarEmpregado();
                break;
                
                case 3:
                    if(apagarEmpregado()){
                        System.out.println("Empregado apagado!");
                    }
                break;
                
                case 4:
                    System.out.println("4.1 Imprimir todos os empregados");
                    System.out.println("4.2 Imprimir um empregados");
                    System.out.println("4.3 Empregado existe");
                                        
                    do{
                        System.out.print("Sub-ação: ");
                        acaoMenu = Teclado.nextDouble();Teclado.nextLine();
                    }while(acaoMenu != 4.1 && acaoMenu != 4.2 && acaoMenu != 4.3);
                    
                    if(acaoMenu == 4.1){
                        System.out.println(imprimirEmpregados());
                    }else if(acaoMenu == 4.2){
                        System.out.println(imprimirEmpregado());
                    }else{
                        System.out.println(existeEmpregado());
                    }
                break;    
                
                case 5:
                    System.out.print(imprimirVencimentos()+"\n-----------\n");
                    TotalVencimentos.setTotalVencimentos(arrEmpregados);
                    System.out.println("Vencimento total: R$ "+ TotalVencimentos.getTotalVencimentos());
                break;    
            }
            
        }while(opcaoMenu != 6);
    }
    
    
    private static void adicionarEmpregado(){
        
    System.out.println("---Gerenciar empregados---");

        do{
            
            System.out.println("1.1 Adicionar Assalariado");
            System.out.println("1.2 Adicionar Comissionado");
            System.out.println("1.3. Adicionar Horista");     
            System.out.println("1.4. Sair");
            
            do{

                System.out.print("Opção: ");
                acaoMenu = Teclado.nextDouble();

            }while(acaoMenu != 1.1 && acaoMenu != 1.2 && acaoMenu != 1.3 && acaoMenu != 1.4);

            if(acaoMenu != 1.4){
                arrEmpregados.add(FactoryEmpregado.criarEmpregado(acaoMenu));                                                              
            }

        }while(acaoMenu != 1.4);
    }
    
    private  static void atualizarEmpregado(){
        System.out.println("---Atualizar empregados---");
        System.out.print("Informe o CPF do empregado: ");
        String cpfAtualizar = Teclado.nextLine();
        
        Empregado e = buscarEmpregado(cpfAtualizar);
        
        if(e != null){
            System.out.println(soutInstancia(e));
            System.out.print("Atualizar o campo: ");
            String campoAtualizar = Teclado.nextLine();
            
            switch(campoAtualizar){
                case "Nome":
                    System.out.print("Novo nome: ");
                    e.setNome(Teclado.nextLine());
                break;

                case "Sobrenome":
                    System.out.print("Novo sobrenome: ");
                    e.setSobrenome(Teclado.nextLine());
                break;

                case "CPF":
                    System.out.print("Novo CPF: ");
                    e.setCpf(Teclado.nextLine());
                break;   

            }

            if(e instanceof Assalariado && campoAtualizar.equals("Salário")){

                Assalariado assalariado = (Assalariado) e;
                System.out.print("Novo salário: R$");
                assalariado.setSalario(Teclado.nextDouble());

            }else if(e instanceof Comissionado){

                Comissionado comissionado = (Comissionado) e;
                switch(campoAtualizar){
                    case "Total de vendas":
                        System.out.print("Novo total de vendas:");
                        comissionado.setTotalVenda(Teclado.nextInt());
                    break;

                    case "Taxa de comissão":
                        System.out.print("Nova taxa de comissão:");
                        comissionado.setTaxaComissao(Teclado.nextDouble());
                    break;    
                } 
            }else{
                Horista horista = (Horista) e;
                
                switch(campoAtualizar){
                    case "Horas trabalhadas":
                        System.out.print("Atualizar horas trabalhadas:");
                        horista.setHorasTrabalhadas(Teclado.nextInt());
                    break;
                    
                    case "Preço por hora":
                        System.out.print("Novo preço por hora:");
                        horista.setPrecoHora(Teclado.nextDouble());
                    break;    
                }
            }
        }else{
            System.out.print("Empregado não encontrado!");
        }    
    }
    
    private static boolean apagarEmpregado(){
        System.out.print("Informe o CPF: ");
        String cpfApagar = Teclado.nextLine();
        
        Empregado e = buscarEmpregado(cpfApagar);
        return arrEmpregados.remove(e);
    }
    private static String imprimirEmpregados(){
        Iterator<Empregado> itEmpregados = arrEmpregados.iterator();
        String empregadosCadastrados = "---Lista de Empregados----\n";
        
        if(itEmpregados.hasNext() == false){
            return "Lista vazia!";
        }
        
        while(itEmpregados.hasNext()){
            Empregado e = itEmpregados.next();
            empregadosCadastrados += e.getCpf() + " - "+ e.getNome() + "\n";
        }
        return empregadosCadastrados;
    }
    
    private static String imprimirEmpregado(){
        System.out.print("Informe o CPF: ");
        String cpf = Teclado.nextLine();
        Empregado e = buscarEmpregado(cpf);
        
        if(e != null){
            return e.toString();
        }else{
            return "Empregado não encontrado!";
        }
    }
    
    private static boolean existeEmpregado(){
        System.out.print("Informe o CPF: ");
        String cpf = Teclado.nextLine();
        return buscarEmpregado(cpf) != null;
    }
    
    private static String imprimirVencimentos(){
        Iterator<Empregado> itEmpregados = arrEmpregados.iterator();
        String empregadosCadastrados = "---Gastos por empregados----\n";
        
        if(itEmpregados.hasNext() == false){
            return "Lista vazia!";
        }
        
        while(itEmpregados.hasNext()){
            Empregado e = itEmpregados.next();
            empregadosCadastrados += e.getCpf() + "- "+ e.vencimentos()+ "\n";
        }
        return empregadosCadastrados;
    }
    private static Empregado buscarEmpregado(String cpf){     
        Iterator<Empregado> itEmpregado = arrEmpregados.iterator();
        
        while(itEmpregado.hasNext()){
            Empregado e = itEmpregado.next();
            System.out.println(e);
            if(e.getCpf().equals(cpf)){
                return e;
            }    
        }
        System.out.println("Empregado não encontrado!");
        return null;
    }
       
    private static String soutInstancia(Empregado e){
        String camposPadrao ="Atualizar o campo: "+ 
                              "\n-Nome"+
                              "\n-Sobrenome"+
                              "\n-CPF"; 
        if(e instanceof Assalariado){
            return camposPadrao +
                    "\nSalário: ";
        }else if(e instanceof Comissionado){
            return camposPadrao +
                    "\n-Total de vendas"+
                    "\n-Taxa de comissão";
        }else{
            return camposPadrao +
                    "\n-Horas trabalhadas"+
                    "\n-Preço por Hora";
        }
    }
}
