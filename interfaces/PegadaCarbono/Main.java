/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces.PegadaCarbono;

import java.util.ArrayList;

/**
 *
 * @author 0057113
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro gol = new Carro("Volkswagen", "Etanol", 900.0F, 1.0F);
        Carro opala = new Carro("Chevrolet", "Gasolina", 1300.0F, 1.4F);
        Carro fusca =  new Carro("Volswagem", "Gasolina", 1100F,1.0F);
        
        Bicicleta b1 = new Bicicleta("Calói", "Elétrica", 12,true, 28);
        Bicicleta b2 = new Bicicleta("Velotrol", "Força humana", 5,false, 10);
        
        Casa casaGuilherme = new Casa(4,false, 18);
        Escola ifmg = new Escola(1000, false, true, true);
        
        System.out.println("Gol: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(gol)+ "/10");
        System.out.println("Opala: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(opala)+ "/10");
        System.out.println("Fusca: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(fusca)+ "/10");
        System.out.println("Calói: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(b1)+ "/10");
        System.out.println("Veletrol: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(b2)+ "/10");
        System.out.println("Minha casa: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(casaGuilherme)+ "/10");
        System.out.println("IFMG: "+ CalculaPegadaCarbono.calcularEmissaoCarbono(ifmg)+ "/10");
    
        ArrayList<EmissorCarbono> emissoresGerais = new ArrayList<>();
        ArrayList<Construcao> emissoresConstrucoes = new ArrayList<>();
        ArrayList<Veiculo> emissoresVeiculos = new ArrayList<>();
        
        emissoresConstrucoes.add(casaGuilherme);
        emissoresConstrucoes.add(ifmg);
       
        emissoresVeiculos.add(gol);
        emissoresVeiculos.add(opala);
        emissoresVeiculos.add(fusca);
        emissoresVeiculos.add(b1);
        emissoresVeiculos.add(b2);
        
        
        emissoresGerais.add(gol);
        emissoresGerais.add(fusca);
        emissoresGerais.add(opala);
        emissoresGerais.add(b1);
        emissoresGerais.add(b2);
        emissoresGerais.add(casaGuilherme);
        emissoresGerais.add(ifmg);
        
        System.out.println("Emissão total construções: " + CalculaPegadaCarbono.emissaoTotal_construcao(emissoresConstrucoes));
        System.out.println("Emissão total veículos: " + CalculaPegadaCarbono.emissaoTotal_veiculos(emissoresVeiculos));
        System.out.println("Emissão total: " + CalculaPegadaCarbono.calculaEmissaoTotal(emissoresGerais));
    }   
}
