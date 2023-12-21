/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author 0057113
 */
public class Poligono extends Forma{
    private int lados;
    
    public Poligono(){
        this.lados = 0;
    }
    
    public Poligono(int numLados){
        if(numLados < 0){
            this.tratar_ladoNegativo();
        }else{
            this.lados = numLados;
        }
    }
    
    public void setLados(int numLados){
        if(numLados < 0){
            this.tratar_ladoNegativo();
        }else{
            this.lados = numLados;
        }
    }
    
    public int getLados(){
        return this.lados;
    }
    
    public void pintar(int cor){
        System.out.println("Nova cor do polígono: #"+ cor);
    }
    
    @Override
    public void desenhar(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    @Override
    public void aumentar(int novoTamanho){
        System.out.println("Tamanho do polígono aumentado para: "+ novoTamanho);
    }
    
    @Override
    public void renderizar(){
        System.out.println("O polígono foi renderizado!");
    }
    
    @Override
    public String toString(){
        return "Polígono"+
                "\nLados: "+ this.lados;
    }
    
    private void tratar_ladoNegativo(){
        try{
            throw new IllegalArgumentException("Valor negativo passado como parâmetro! Foi atribuido o valor 0.");
        }catch(IllegalArgumentException error){
            System.out.println(error.getMessage());
            this.lados = 0;
        }
    }
}
