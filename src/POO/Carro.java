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
    
    void imprimeDadosCarro(){
        System.out.println("---------------Carro------------------");
        System.out.println(tipo);
        System.out.println(cor);
        System.out.println(placa);
        System.out.println(numPortas);
    }
    
   public Carro(){
       
   }
    
    public Carro(String tipo, String cor, String placa, int numPortas){
    this.tipo = tipo;
    this.cor = cor;
    this.placa = placa;
    this.numPortas = numPortas;
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
