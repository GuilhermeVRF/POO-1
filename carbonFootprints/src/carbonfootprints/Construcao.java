/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprints;

/**
 *
 * @author 0057113
 */
public class Construcao {
    private int numHabitantes;
    private boolean usaEnergiaRenovavel;
    
    public Construcao(int numHabitantes, boolean usaEnergiaRenovavel){
        this.numHabitantes = numHabitantes;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
    }
    
    public void setNumHabitantes(int numHabitantes){
        this.numHabitantes = numHabitantes;
    }
    
    public int getNumHabitantes(){
        return this.numHabitantes;
    }
    
    public void setUsaEnergiaRenovavel(boolean usaEnergiaRenovavel){
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
    }
    
    public boolean getUsaEnergiaRenovavel(){
        return this.usaEnergiaRenovavel;
    }
}
