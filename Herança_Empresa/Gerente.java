/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Gerente extends Funcionario{
    private String senha;
    private int qtdeFuncionarios;
    
    public Gerente(String nome, String CPF, double salario, String senha){
        super(nome,CPF,salario);
        this.senha =  senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }
    public boolean verificaSenha(String senha){
        return this.senha.equals(senha);
    }
    @Override
    public double bonificacaoSalarial(){
        return this.getSalario() * + 1000;
    }
}
