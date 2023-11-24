/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado;
import Polimorfismo.Empregado.Colaboradores.Empregado;
import Polimorfismo.Empregado.Colaboradores.Horista;
import Polimorfismo.Empregado.Colaboradores.Comissionado;
import Polimorfismo.Empregado.Colaboradores.Assalariado;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public  class FactoryEmpregado {
    private static Scanner Teclado;
    
    public static Empregado criarEmpregado(double param){
        Teclado = new Scanner(System.in);
        Empregado empregado;
        
        System.out.print("Nome: ");
        String nome = Teclado.nextLine();
        
        System.out.print("Sobrenome: ");
        String sobrenome = Teclado.nextLine();
        
        System.out.print("CPF: ");
        String cpf = Teclado.nextLine();
            
        if(param == 1.1){
            System.out.print("Salário: R$");
            double salario = Teclado.nextDouble();

            empregado = new Assalariado(nome, sobrenome, cpf, salario);
        }else if(param == 1.2){

            System.out.print("Total de vendas: ");
            double totalVendas = Teclado.nextDouble();

            System.out.print("Taxa de comissão: R$");
            double taxaComissao = Teclado.nextDouble();

            empregado = new Comissionado(nome, sobrenome, cpf, totalVendas, taxaComissao);
        }else{
            
        
            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = Teclado.nextInt();

            System.out.print("Valor por hora: R$");
            double valorHora = Teclado.nextDouble();

            empregado = new Horista(nome, sobrenome, cpf, horasTrabalhadas ,valorHora);
        }
        
        System.out.println("----------\n"+ empregado.getClass().getSimpleName()+ " \n-----------\n"+ empregado.toString());
        Teclado = null;
        return empregado;
    }
}
