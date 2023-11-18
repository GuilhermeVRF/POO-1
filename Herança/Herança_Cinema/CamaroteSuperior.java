/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Cinema;

/**
 *
 * @author guilh
 */
public class CamaroteSuperior extends VIP{
    private int locCamaroteSuperior;
    private double valorAdicional;
    
    public CamaroteSuperior(double preco, double aumento, int locCamaroteSuperior, double valorAdicional){
        super(preco, aumento + valorAdicional);
        this.locCamaroteSuperior = locCamaroteSuperior;
        this.valorAdicional = valorAdicional;
    }
    public void setLocCamaroteSuperior(int locCamaroteSuperior){
        this.locCamaroteSuperior = locCamaroteSuperior;
    }
    public int getLocCamaroteSuperior(){
        return this.locCamaroteSuperior;
    }
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional(){
        return this.valorAdicional;
    }
    @Override
    public String toString(){
        return "O Camarote superior é um ingresso VIP: \n"+ super.toString() +"\nMas esse tipo de ingresso tem um valor adicionala mais\nPreço: R$"+ (super.valorIngresso() + this.valorAdicional);
    }
}
