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
        
    
        
       
        Pessoa p = new Pessoa("Jonas", "pardo", 1.72, 21);
        Carro carro = new Carro("Gol","Prata","KJH-8924",2);
        carro.setDono(p);
        p.setCarro(carro);
        
        p.ligarCarro();
        p.setCambioMarcha(1);
        p.acelerarCarro();
        p.setCambioMarcha(2);
        p.acelerarCarro();
        p.setCambioMarcha(3);
        p.acelerarCarro();
        p.setCambioMarcha(4);
        System.out.println("");
        
        p.getCarro().getCambio();
        
        
        
        carro.imprimeDadosCarro();
        p.imprimeDadosPessoa();
        
        
    }
}
