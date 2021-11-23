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

        System.out.println("---------------Carro------------------");
        System.out.println(carro.getTipo());
        System.out.println(carro.getCor());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getNumPortas());

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Guilherme Recalcatte Vogel");
        pessoa.setCor("Branco");
        pessoa.setIdade(16);
        pessoa.setAltura(1.57);

        System.out.println("---------------Pessoa-----------------");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCor());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

    }
}
