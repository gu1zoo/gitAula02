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
public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    Pessoa dono;
    int cambio;
    
    public Carro(String tipo, String cor, String placa, int numPortas){
    this.tipo = tipo;
    this.cor = cor;
    this.placa = placa;
    this.numPortas = numPortas;
    }   
    void imprimeDadosCarro(){
        System.out.println("---------------Carro------------------");
        System.out.println("Modelo: "+tipo);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placa);
        System.out.println("Número de portas: "+numPortas);
        System.out.println("Dono: "+dono.nome);
    } 
     
    void ligar(){
       System.out.println("Ligando o carro");
    }
    void desligar(){
        System.out.println("Desligando o carro");
    }    
    void acelerar(){
        System.out.println("Acelerando");
    }    
    void frear(){
        System.out.println("Freiando");
    }
    
    
    
    
    
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public int getCambio() {
        System.out.println("Marcha: "+ this.cambio);
        return cambio;
    }
    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo; 
    }
    
    public String getCor(){
        return cor;
    }
     public void setCor(String cor){
        this.cor = cor;
    }
     
     public String getPlaca(){
        return placa;
    }
     public void setPlaca(String placa){
        this.placa = placa;
    }
     
    public int getNumPortas(){
        return numPortas;
    }
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
}
