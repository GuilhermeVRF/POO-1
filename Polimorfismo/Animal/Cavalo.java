/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Animal;

/**
 *
 * @author guilh
 */
public class Cavalo extends Animal{
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Iiirrrrí!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Galopando");
    }
}
