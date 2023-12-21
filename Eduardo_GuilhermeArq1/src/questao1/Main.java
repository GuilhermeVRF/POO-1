/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author 0057113
 */
public class Main {
    private static int totalLados = 0;
    
    public static void exibirFormasCadastradas(ArrayList<Forma> listaFormas){
        Iterator<Forma> iterador = listaFormas.iterator();
        
        while(iterador.hasNext()){
            Forma formaAtual = iterador.next();
            System.out.println(formaAtual);
            
            if(formaAtual instanceof Poligono){
                Poligono poligonoAtual = (Poligono) formaAtual;
                totalLados += poligonoAtual.getLados();
            }          
        }
        
        System.out.println("Total de lados: "+ totalLados);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();
        
        Poligono p1 = new Poligono(4);
        Poligono p2 = new Poligono(6);
        Poligono p3 = new Poligono(3);
        
        Linha l1 = new Linha(1,3,5,7);
        Linha l2 = new Linha(0,4,6,10);
        Linha l3 = new Linha(2,5,7,11);
        
        listaFormas.add(p1);
        listaFormas.add(p2);
        listaFormas.add(p3);
        
        listaFormas.add(l1);
        listaFormas.add(l2);
        listaFormas.add(l3);
        
        exibirFormasCadastradas(listaFormas);
    }
    
}
