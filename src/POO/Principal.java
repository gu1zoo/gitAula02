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
        Carro carro = new Carro();

        carro.setCor("Prata");
        carro.setNumPortas(4);
        carro.setPlaca("QHK-4585");
        carro.setTipo("Ford Focus");

        carro.imprimeDadosCarro();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Guilherme Recalcatte Vogel");
        pessoa.setCor("Branco");
        pessoa.setIdade(16);
        pessoa.setAltura(1.57);

       pessoa.imprimirDadosPessoa();

    }
}
