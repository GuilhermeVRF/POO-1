/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Herança_Imovel;

/**
 *
 * @author guilh
 */
public class ImovelVelho extends Imovel{
    
    private double desconto;
    
    public ImovelVelho(String endereco, double preco, double desconto){
        super(endereco, preco - desconto);
        this.desconto = desconto;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    public double getDesconto(){
        return this.desconto;
    }
    public double calculaPercentDesconto(){
        return (this.desconto/super.getPreco())* 100;
    }
    public String toString(){
        return super.toString() + "\nDesconto: R$ "+ this.desconto;
    }
}
