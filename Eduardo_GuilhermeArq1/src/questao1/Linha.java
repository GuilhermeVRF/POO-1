/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author 0057113
 */
public class Linha extends Forma{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public Linha(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }    
    
    public Linha(){
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = 0.0;
        this.y2 = 0.0;
    }
    
    public void setX1(double x1){
        this.x1 = x1;
    }
    
    public double getX1(){
        return this.x1;
    }
    
    public void setY1(double y1){
        this.y1 = y1;
    }
    
    public double getY1(){
        return this.y1;
    }
    
    public void setX2(double x2){
        this.x2 = x2;
    }
    
    public double getX2(){
        return this.x2;
    }
    
    public void setY2(double y2){
        this.y2 = y2;
    }
    
    public double getY2(){
        return this.y2;
    }
    
    @Override
    public void desenhar(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    @Override
    public void aumentar(int novoTamanho){
        System.out.println("Tamanho da linha aumentado para: "+ novoTamanho);
    }
    
    @Override
    public void renderizar(){
        System.out.println("A linha foi renderizada!");
    }
    
    @Override
    public String toString(){
        return "Linha"+
                "\nX1 = "+ this.x1 +
                "\nY1 = "+ this.y1 +
                "\nX2 = "+ this.x2 +
                "\nY2 = "+ this.y2;
    }
}
