/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.PegadaCarbono;

/**
 *
 * @author guilh
 */
public class Escola extends Construcao{
   public boolean areaVerde;
   public boolean projetosEcologicos;
   
   public Escola(int numFrequentadores, boolean energiaRenovavel, boolean areaVerde, boolean projetosEcologicos){
       super(numFrequentadores, energiaRenovavel);
       this.areaVerde = areaVerde;
       this.projetosEcologicos = projetosEcologicos;
   }
   
   public void setAreaVerde(boolean areaVerde){
       this.areaVerde = areaVerde;
   }
   
   public boolean getAreaVerde(){
       return this.areaVerde;
   }
   
   public void setProjetosEcologicos(boolean projetosEcologicos){
       this.projetosEcologicos = projetosEcologicos;
   }
   
   public boolean getProjetosEcologicos(){
       return this.projetosEcologicos;
   }
   
   @Override
   public int getEmissaoCarbono(){
       int emissaoCarbono = 10;
       
       emissaoCarbono -= (this.getUsaEnergiaRenovavel()) ? 4 : 0;
       emissaoCarbono -= (this.areaVerde) ? 2 : 0;
       emissaoCarbono -= (this.projetosEcologicos) ? 2 : 0;
       
       return emissaoCarbono;
   }
}
