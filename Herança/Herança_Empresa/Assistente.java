/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Assistente extends Funcionario{
    private int numMatricula;
    
    public Assistente(String nome, String CPF, double salario, int numMatricula){
        super(nome,CPF,salario);
        this.numMatricula = numMatricula;
    }

    public double bonificacaoSalarial(){
        return this.salario * 0.70;
    }
    
    @Override
    public String toString() {
        return super.toString() +"\nMatrícula: "+ this.numMatricula;
    }
}
