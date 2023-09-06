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
        String aumentarVOL = "A televis�o est� desligada!";
        
        if(this.estadoTV){
            aumentarVOL = "O volume est� no m�ximo! "+ this.volume;
        
            if(this.volume < 16){
                aumentarVOL = "Volume aumentado! "+ ++this.volume;         
            }
        }
        return aumentarVOL;
    }
    String diminuirVolume(){
        String diminuirVolume = "A televis�o est� desligada!";
                
        if(this.estadoTV){
            diminuirVolume = "O volume est� no m�nimo! "+ this.volume;

            if(this.volume > 1){
                diminuirVolume = "Volume diminu�do! "+ --this.volume;            
            }
        }
        return diminuirVolume;
    }
    String aumentarCanal(){
        String aumentarCN = "A televis�o est� desligada!";
        
        if(this.estadoTV){
            aumentarCN = "Canal m�ximo em exibi��o!"+ this.canal;

            if(this.canal < 16){
                aumentarCN = "Canal aumentado! "+ ++this.canal;
            }
        }
        return aumentarCN;
    }
    String diminuirCanal(){
        String diminuirCN = "A televis�o est� deligada!";
        
        if(this.estadoTV){
            diminuirCN = "Canal m�nimo em exibi��o! "+ this.canal;

            if(this.canal > 1){
                diminuirCN = "Canal diminu�do! "+ --this.canal;

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
            System.out.println("Televis�o: "+ this.estadoTV);
            System.out.println("Volume: "+ this.volume);
            System.out.println("Canal: "+ this.canal);
          
    }
}
