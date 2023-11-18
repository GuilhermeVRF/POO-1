/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança_Cinema;

/**
 *
 * @author guilh
 */
public class CamaroteInferior extends VIP{
    private int locCamaroteInf;
    public CamaroteInferior(double preco, double aumento, int locCamaroteInf){
        super(preco, aumento);
        this.locCamaroteInf = locCamaroteInf;
    }
    public void setLocCamaroteInf(int locCamaroteInf){
        this.locCamaroteInf =  locCamaroteInf;
    }
    public int getLocCamaroteInf(){
        return this.locCamaroteInf;
    }
    @Override
    public String toString(){
        return super.toString()+ "\nLocalizção no camarote inferior: "+this.locCamaroteInf;
    }
}
