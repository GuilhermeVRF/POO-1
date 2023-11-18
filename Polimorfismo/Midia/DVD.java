/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Midia;

/**
 *
 * @author guilh
 */
public class DVD extends Midia<DVD>{
    private int numeroFaixas;
    
    public DVD(){
        super();
        this.numeroFaixas = 0;
    }
    
    public DVD(String nome){
        super(nome);
        this.numeroFaixas = 0;
    }
    
    public DVD(int codigo,String nome, double preco, int numeroFaixas){
        super(codigo, nome, preco);
        this.numeroFaixas = numeroFaixas;
    }
    
    public void setNumeroFaixas(int numeroFaixas){
        this.numeroFaixas = numeroFaixas;
    }
    
    public int getNumeroFaixas(){
        return this.numeroFaixas;
    }    
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() +
               "\n Número de faixas: "+ this.numeroFaixas;
    }
    
    @Override
    public int compareTo(DVD outroDVD){
        if(this.hashCode() < outroDVD.hashCode()){
            return -1;
        }else{
            return 1;
        }
    }
    
    /*@Override
    public String toString(){
        return "Mídia: "+ this.getTipo() +
                "\n"+ this.getDetalhes()+ "\n";
    }*/
}
