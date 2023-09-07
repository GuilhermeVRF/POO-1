/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto_PessoaIdade;

/**
 *
 * @author guilh
 */
public class PessoaIdade {
    String nomePessoa;
    String idadePessoa;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    

    void ajustaDataDeNascimento(int diaNascimento, int mesNascimento, int anoNascimento){
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        
    }
    
    void calculaIdade(){
        int anoIdade, mesIdade, diaIdade;
        
        anoIdade = 2023 - this.anoNascimento;
        
        if(this.mesNascimento > 9){
            mesIdade = ((this.mesNascimento - 9) - 12) * -1;
            anoIdade--;
        }else{
            mesIdade = (this.mesNascimento - 9) * -1;
        }
            
        if(this.diaNascimento > 7){
             diaIdade = ((this.diaNascimento - 7) - 31) * -1;       
             mesIdade--;
        }else{
            diaIdade = (this.diaNascimento - 7) * -1;          
        }
        this.idadePessoa = "A idade de "+ this.nomePessoa + ": "+ anoIdade + " anos "+ mesIdade + " meses " + diaIdade + " dias";
    }
    void informaIdade(){
        System.out.println(this.idadePessoa);
    }
    
}
