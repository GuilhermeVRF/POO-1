package interfaces.PegadaCarbono;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class CalculaPegadaCarbono {
    //Percorrendo usando polimorfismo da interface.
    public static int calcularEmissaoCarbono(EmissorCarbono emissor){
        return emissor.getEmissaoCarbono();
    }
    
    public static int calculaEmissaoTotal(ArrayList<EmissorCarbono> emissores){
        Iterator<EmissorCarbono> percorrer = emissores.iterator();
        
        int emissaoTotal = 0;
        
        while(percorrer.hasNext()){
            EmissorCarbono emissor = percorrer.next();
            emissaoTotal +=emissor.getEmissaoCarbono();
        }
        
        return emissaoTotal;
    }
    //Usando polimorfismo declasse abstrata e interface.
    public static int emissaoTotal_construcao(ArrayList<Construcao> emissoresConstrucao){
        int emissaoTotal_construcao = 0;
        Iterator<Construcao> percorrerConstrucao = emissoresConstrucao.iterator();
        
        while(percorrerConstrucao.hasNext()){
            EmissorCarbono emissor = percorrerConstrucao.next();
            emissaoTotal_construcao += emissor.getEmissaoCarbono();
        }
        
        return emissaoTotal_construcao;
    }
    
    public static int emissaoTotal_veiculos(ArrayList<Veiculo> emissoresVeiculos){
        int emissaoTotal_veiculos = 0;
        Iterator<Veiculo>percorrerVeiculos = emissoresVeiculos.iterator();
        
        while(percorrerVeiculos.hasNext()){
            EmissorCarbono emissor = percorrerVeiculos.next();
            emissaoTotal_veiculos += emissor.getEmissaoCarbono();
        }
        
        return emissaoTotal_veiculos;
    }
}
