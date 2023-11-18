/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Tecnico extends Assistente{
    private double bonusSalarial;
    
    public Tecnico(String nome, String CPF, double salario, int numMatricula, double bonusSalarial){
        super(nome, CPF, salario, numMatricula);
        this.bonusSalarial = bonusSalarial;
    }
    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }
    public double getBonusSalarial(){
        return this.bonusSalarial;
    }
    
    @Override
    public double ganhoAnual(){
        return super.ganhoAnual() + this.bonusSalarial;
    }
}
