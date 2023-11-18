/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Cinema;

/**
 *
 * @author guilh
 */
public class VIP extends Ingresso{
    private double aumentoPreco;
    
    public VIP(double preco, double aumento){
        super(preco);
        this.aumentoPreco = aumento;
    }
    public double valorIngresso(){
        return super.getPreco() + this.aumentoPreco;
    }
    public String toString(){
        return "Preço: R$"+ this.valorIngresso();
    }
}
