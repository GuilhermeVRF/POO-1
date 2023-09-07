/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto_Fatura;

/**
 *
 * @author guilh
 */
public class Fatura {
    String numeroID;
    String descProduto;
    int qtdeCompradaProduto;
    double precoProduto;
    
    void setNumeroID(String numeroID){
        this.numeroID = numeroID;
    }
    void setDescProduto(String descProduto){
        this.descProduto = descProduto;
    }
    void setQtdeProduto(int qtdeCompradaProduto){
        this.qtdeCompradaProduto = qtdeCompradaProduto;
    }
    void setPrecoProduto(double precoProduto){
        if(precoProduto < 0){
            this.precoProduto = 0;
        }else{
            this.precoProduto = precoProduto;
        }
    }
    String getNumeroID(){
        return this.numeroID;
    }
    String getDescProduto(){
        return this.descProduto;
    }
    int getQtdeProduto(){
        return this.qtdeCompradaProduto;
    }
    double getPrecoProduto(){
        return this.precoProduto;
    }
    double getTotalFatura(){
        double gastoTotal;
          
        gastoTotal = this.precoProduto * this.qtdeCompradaProduto;
        
        if(gastoTotal < 0){
            gastoTotal = 0;
        }
        return gastoTotal;        
    }
}
