/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public abstract class Funcionario {
    protected String nome;
    protected String CPF;
    protected double salario;
    
    public Funcionario(String nome, String CPF, double salario){
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public double getSalario() {
        return salario;
    }
    public void addAumento(double aumento){
        this.salario += aumento;
    }
    public double ganhoAnual(){
        return this.salario * 12;
    }
    public  abstract double bonificacaoSalarial();
    
    @Override
    public String toString(){
        return "Nome: "+ this.nome + "\nCPF: "+ this.CPF + "\nSalário: "+ this.salario;
    }
}
