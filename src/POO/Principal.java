/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Principal {

    public static void main(String[] args) {
        //Carro carro = new Carro("Gol","Prata","KJH-8924",2);
    //carro.imprimeDadosCarro();

         Carro outroCarro = new Carro();
         outroCarro.setCor("preto");
         outroCarro.setPlaca("KHK-9856");
         outroCarro.setNumPortas(4);
         outroCarro.setTipo("fuscao");
         
        
        //Pessoa pessoa = new Pessoa();
/*
       pessoa.imprimirDadosPessoa();
       double a=3, b=2;
       System.out.println("Teste de método: "+Calculo.elevar(a,b));
*/
              
    }
}
