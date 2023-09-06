package objeto_televisao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class Televisao {
    int canal;
    int volume;
    boolean estadoTV;
    
    Televisao(){
        this.canal = 1;
        this.volume = 1;
        this.estadoTV = false;
    }
    
    String aumentarVolume(){
        String aumentarVOL = "A televisão está desligada!";
        
        if(this.estadoTV){
            aumentarVOL = "O volume está no máximo! "+ this.volume;
        
            if(this.volume < 16){
                aumentarVOL = "Volume aumentado! "+ ++this.volume;         
            }
        }
        return aumentarVOL;
    }
    String diminuirVolume(){
        String diminuirVolume = "A televisão está desligada!";
                
        if(this.estadoTV){
            diminuirVolume = "O volume está no mínimo! "+ this.volume;

            if(this.volume > 1){
                diminuirVolume = "Volume diminuído! "+ --this.volume;            
            }
        }
        return diminuirVolume;
    }
    String aumentarCanal(){
        String aumentarCN = "A televisão está desligada!";
        
        if(this.estadoTV){
            aumentarCN = "Canal máximo em exibição!"+ this.canal;

            if(this.canal < 16){
                aumentarCN = "Canal aumentado! "+ ++this.canal;
            }
        }
        return aumentarCN;
    }
    String diminuirCanal(){
        String diminuirCN = "A televisão está deligada!";
        
        if(this.estadoTV){
            diminuirCN = "Canal mínimo em exibição! "+ this.canal;

            if(this.canal > 1){
                diminuirCN = "Canal diminuído! "+ --this.canal;

            }
        }
        return diminuirCN;
    }
    boolean ligarTelevisao(){
        this.estadoTV = true;
        return this.estadoTV;
    }
    boolean desligarTelevisao(){
        this.estadoTV = false;
        return this.estadoTV;
    }
    void statusTV(){
            System.out.println("Televisão: "+ this.estadoTV);
            System.out.println("Volume: "+ this.volume);
            System.out.println("Canal: "+ this.canal);
          
    }
}
