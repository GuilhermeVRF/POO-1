/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.PegadaCarbono;

/**
 *
 * @author 0057113
 */
public class Bicicleta extends Veiculo implements EmissorCarbono{
    private String marca;
    private boolean materiaSustentavel;
    private int tamanhoAro;
    
    public Bicicleta(String marca, String combustivel, float peso, boolean materiaSustentavel, int tamanhoAro){
        super(marca,combustivel, peso);
        this.materiaSustentavel = materiaSustentavel;
        this.tamanhoAro = tamanhoAro;
    }
    
    public void setMaterialSustentavel(boolean materialSustentavel){
        this.materiaSustentavel = materialSustentavel;
    }
    
    public boolean getMaterialSustentavel(){
        return this.materiaSustentavel;
    }
    
    public void setTamanhoAro(int tamanhoAro){
        this.tamanhoAro = tamanhoAro;
    }
    
    public int getTamanhoAro(){
        return this.tamanhoAro;
    }
    
    @Override
    public int getEmissaoCarbono(){
        int emissaoCarbono;
        
        emissaoCarbono = (this.getCombustivel().equals("Força humana")) ? 1 : 3;
        emissaoCarbono += (this.getPeso() > 11.0F) ? 2 : 1;
        emissaoCarbono += (this.materiaSustentavel) ? 1 : 3;
        emissaoCarbono += (this.tamanhoAro >= 25) ? 1 : 2;
        
        return emissaoCarbono;
    }
}
