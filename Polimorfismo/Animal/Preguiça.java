/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Animal;

/**
 *
 * @author guilh
 */
public class Preguiça extends Animal{
    public Preguiça(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Fuuiiiiiiiu!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Subindo em árvores!");
    }
}
