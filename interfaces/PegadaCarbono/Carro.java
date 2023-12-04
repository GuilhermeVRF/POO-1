/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.PegadaCarbono;

/**
 *
 * @author 0057113
 */
public class Carro extends Veiculo implements EmissorCarbono{
    private float cilindrada;
    
    public Carro(String marca, String combustivel, float peso,float cilindrada){
        super(marca, combustivel, peso);
        this.cilindrada = cilindrada;
    }    
    
    public void setCilindrada(float cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public float getCilindrada(){
        return this.cilindrada;
    }
    
    @Override
    public int getEmissaoCarbono(){
        int emissaoCarbono;
        
        emissaoCarbono = !(this.getCombustivel().equals("Etanol") || this.getCombustivel().equals("Alcool")) ? 4 : 2;         
        emissaoCarbono += (this.getPeso() > 1200) ? 3 : 1;
        emissaoCarbono += (this.cilindrada != 1.0) ? 3 : 2;
        
        return emissaoCarbono;
    }
}
