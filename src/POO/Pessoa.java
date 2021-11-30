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
public class Pessoa {

    String nome;
    String cor;
    double altura;
    int idade;
    Carro carro;
    public Pessoa(String nome, String cor, double altura, int idade){
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.idade = idade;
    }  
    
    void imprimeDadosPessoa(){
        System.out.println("---------------Pessoa-----------------");
        System.out.println("Nome: "+nome);
        System.out.println("Cor: "+cor);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Carro: "+carro.tipo);
    }

    
    void ligarCarro(){
        carro.ligar();
    }
    void desligarCarro(){
        carro.desligar();
    }
    void acelerarCarro(){
        carro.acelerar();
    }
    void frearCarro(){
        carro.frear();
    }
    void setCambioMarcha(int marcha){
        System.out.println("Trocando de marcha");
        carro.setCambio(marcha);
    }
    
    
    
    
    
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
