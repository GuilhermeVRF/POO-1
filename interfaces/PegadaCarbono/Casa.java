/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.PegadaCarbono;

/**
 *
 * @author guilh
 */
public class Casa extends Construcao{
    private int numEletrodomesticos;
    
    public Casa(int numHabitantes, boolean energiaRenovavel, int numEletrodomesticos){
        super(numHabitantes, energiaRenovavel);
        this.numEletrodomesticos = numEletrodomesticos;
    }
    
    public void setNumEletrodomesticos(int numEletrodomesticos){
        this.numEletrodomesticos = numEletrodomesticos;
    }
    
    public int getNumEletrodomesticos(){
        return this.numEletrodomesticos;
    }
    
    @Override
    public int getEmissaoCarbono(){
        int emissaoCarbono;
        
        emissaoCarbono = (this.getNumHabitantes() >= 2) ? 3 : 1;
        emissaoCarbono += (this.getUsaEnergiaRenovavel()) ? 1: 4;
        emissaoCarbono += (this.numEletrodomesticos > 6) ? 3 : 2;
        
        return emissaoCarbono;
    }
}
