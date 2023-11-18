/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Empresa;

/**
 *
 * @author guilh
 */
public class Administrativo extends Assistente{
    private String turno;
    
    public Administrativo(String nome, String CPF, double salario, int numMatricula, String turno){
        super(nome,CPF,salario,numMatricula);
        this.turno = turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    public String getTurno(){
        return this.turno;
    }
    @Override
    public double ganhoAnual(){
        int bonusSalarial = 0;
        
        if(this.turno.equals("Noturno")){
            bonusSalarial = 200;
        }
        return super.ganhoAnual() + bonusSalarial;
    }
    public String toString(){
        return super.toString() + "\nTurno: "+ this.turno;
    }
}
