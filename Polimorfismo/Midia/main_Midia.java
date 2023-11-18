/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo.Midia;

import Polimorfismo.Midia.ArvoreBinaria.ArvoreBinaria;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class main_Midia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        ArvoreBinaria<DVD> listaDVD = new ArvoreBinaria<>();
        ArvoreBinaria<CD> listaCD = new ArvoreBinaria<>();
        int opcaoMenu;
        do{
            System.out.println("1.Cadastrar DVD \n2.Cadastrar CD \n3.Sair");
            opcaoMenu = Teclado.nextInt();
            
            switch(opcaoMenu){
                case 1:
                    DVD cadastrarDVD = new DVD();
                    listaDVD.add((DVD) InserirDados.criarMidia(cadastrarDVD));
                break;   
                
                case 2:
                    CD cadastrarCD = new CD();
                    listaCD.add((CD) InserirDados.criarMidia(cadastrarCD));
            }
        }while(opcaoMenu != 3);
    }
    
}
