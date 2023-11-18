/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Secretario extends Funcionario{
    private String numeroTelefone;
    
    public Secretario(String nome, String cpf, double salario, String numeroTelefone){
        super(nome,cpf, salario);
        this.numeroTelefone = numeroTelefone;
    }
    
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNumeroTelefone(){
        return this.numeroTelefone;
    }
    
    @Override
    public double bonificacaoSalarial(){
        return this.salario * 0.80;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNúmero de telefone: " + this.numeroTelefone;
    }
}
