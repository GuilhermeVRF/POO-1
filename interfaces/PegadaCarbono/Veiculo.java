/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.PegadaCarbono;

/**
 *
 * @author guilh
 */
public abstract class Veiculo implements EmissorCarbono{
    private String marca;
    private String combustivel;
    private float peso;
    
    public Veiculo(String marca,String combustivel, float peso){
        this.marca = marca;
        this.combustivel = combustivel;
        this.peso = peso;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    
    public String getCombustivel(){
        return this.combustivel;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return this.peso;
    }

    @Override
    public abstract int getEmissaoCarbono();
}
