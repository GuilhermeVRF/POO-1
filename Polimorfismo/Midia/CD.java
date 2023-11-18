/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Midia;

/**
 *
 * @author guilh
 */
public class CD extends Midia<CD>{
    private int numeroMusicas;
    
    public CD(){
        super();
        this.numeroMusicas = 0;
    }
    
    public CD(int codigo, String nome, double preco, int numeroMusicas){
        super(codigo, nome, preco);
        this.numeroMusicas = numeroMusicas;
    }
    
    public void setNumeroMusicas(int numeroMusicas){
        this.numeroMusicas = numeroMusicas;
    }
    
    public int getNumeroMusicas(){
        return this.numeroMusicas;
    }
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() +
                "\n Número de músicas: "+ this.numeroMusicas; 
    }
    
    @Override
    public int compareTo(CD outroCD){
        if(this.hashCode() < outroCD.hashCode()){
            return -1;
        }else{
            return 1;
        }
    }
    
    @Override
    public String toString(){
        return "Mídia: "+ this.getTipo() +
                "\n"+ this.getDetalhes() + "\n";
    }
}
