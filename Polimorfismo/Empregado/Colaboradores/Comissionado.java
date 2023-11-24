/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado.Colaboradores;

/**
 *
 * @author guilh
 */
public class Comissionado extends Empregado{
    private double totalVenda;
    private double taxaComissao;
    
    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao){
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }
    
    public void setTotalVenda(double totalVenda){
        this.totalVenda = totalVenda;
    }
    
    public double getTotalVenda(){
        return this.totalVenda;
    }
    
    public void setTaxaComissao(double taxaComissao){
        this.taxaComissao = taxaComissao;
    }
    
    public double getTaxaComissao(){
        return this.taxaComissao;
    }
    
    @Override
    public double vencimentos(){
        return this.totalVenda * this.taxaComissao;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nVencimentos: R$"+ this.vencimentos();
    }
}
