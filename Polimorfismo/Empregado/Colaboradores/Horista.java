/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Empregado.Colaboradores;

/**
 *
 * @author guilh
 */
public class Horista extends Empregado{
    private int horasTrabalhadas;
    private double precoHora;
    
    public Horista(String nome, String sobrenome, String cpf, int horasTrabalhadas, double precoHora){
        super(nome, sobrenome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoHora = precoHora;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    
    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }
    
    public double getPrecoHora(){
        return this.precoHora;
    }
    
    @Override
    public double vencimentos(){
        return this.precoHora * this.horasTrabalhadas;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nVencimentos: R$"+ this.vencimentos();
    }
}
