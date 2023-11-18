/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Herança_Imovel;

/**
 *
 * @author guilh
 */
public class ImovelNovo extends Imovel{
    
    private double valorAdicional;
    
    public ImovelNovo(String endereco, double preco, double valorAdicional){
        super(endereco, preco + valorAdicional);
        this.valorAdicional = valorAdicional;
    }
    
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional(){
        return this.valorAdicional;
    }
    public double calculaPercentAumento(){
        return (this.valorAdicional/super.getPreco()) * 100;
    }
    @Override
    public String toString(){
        return super.toString() + "\nValor adicional: R$ "+ this.valorAdicional;
    }
}
