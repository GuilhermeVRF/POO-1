/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author 0057113
 */
public class Texto implements Renderizavel{
    private String conteudo;
    private int fonte;
    private int cor;
    
    public Texto(String conteudo, int fonte, int cor){
        this.conteudo = conteudo;
        this.fonte = fonte;
        this.cor = cor;
    }
    
    public Texto(){
        this.conteudo = null;
        this.fonte = 0;
        this.cor = 0;
    }
    
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    
    public String getConteudo(){
        return this.conteudo;
    }
    
    public void setFonte(int fonte){
        this.fonte = fonte;
    }
    
    public int getFonte(){
        return this.fonte;
    }
    
    public void setCor(int cor){
        this.cor = cor;
    }
    
    public int getCor(){
        return this.cor;
    }
    
    public void escrever(){
        System.out.println(this.conteudo);
    }
    
    @Override
    public void renderizar(){
        System.out.println("O texto foi renderizado!");
    }
    
    @Override
    public String toString(){
        return "Texto" +
                "\nConteudo: "+ this.conteudo +
                "\nFonte: "+ this.fonte +
                "\nCor: #"+ this.cor;
    }
}
