/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado.Colaboradores;

import Polimorfismo.Empregado.Colaboradores.Empregado;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author guilh
 */
public class TotalVencimentos {
    
    private static double totalVencimentos = 0;
    
    public static void setTotalVencimentos(ArrayList<Empregado> arrEmpregado){
        Iterator<Empregado> itArr = arrEmpregado.iterator();
        while(itArr.hasNext()){
            totalVencimentos += itArr.next().vencimentos();
        }
    }
    
    public static double getTotalVencimentos(){
        return totalVencimentos;
    }
    
}
