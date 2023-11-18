/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Cinema;

/**
 *
 * @author guilh
 */
public class Ingresso {
    private double preco;
    
    public Ingresso(double preco){
        this.preco = preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    
    @Override
    public String toString(){
        return "Preço: R$"+ this.preco;
    }
}
