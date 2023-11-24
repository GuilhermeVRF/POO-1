/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado.Colaboradores;

/**
 *
 * @author guilh
 */
public class Assalariado extends Empregado{
    private double salario;
    
    public Assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    @Override
    public double vencimentos(){
        return this.salario;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nSalário: "+ this.vencimentos();
    }
}
