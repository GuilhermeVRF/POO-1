/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprints;

/**
 *
 * @author 0057113
 */
public class Carro {
    private String combustivel;
    private float cilindrada;
    
    public Carro(String combustivel, float cilindrada){
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }
    
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    
    public String getCombustivel(){
        return this.combustivel;
    }
    
    public void setCilindrada(float cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public float getCilindrada(){
        return this.cilindrada;
    }
    
}
