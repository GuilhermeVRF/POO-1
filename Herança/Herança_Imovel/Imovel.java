/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Herança_Imovel;

/**
 *
 * @author guilh
 */
public class Imovel {
    
    protected String endereco;
    protected double preco;
    
    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
    
    public void setEndereco(String endereco){
        this.endereco= endereco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public double getPreco(){
        return this.preco;
    }
    @Override
    public String toString(){
        return super.toString() + "\nEndereço: "+ this.endereco + "\nPreço: R$ "+ this.preco;
    }
}
