/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Diretor extends Gerente{
    int numDep;
    
    public Diretor(String nome, String CPF, double salario, String senha, int numDep){
        super(nome,CPF,salario,senha);
        this.numDep = numDep;
    }
    
    @Override
    public double bonificacaoSalarial(){
        return super.bonificacaoSalarial() + 5000;
    }
}
