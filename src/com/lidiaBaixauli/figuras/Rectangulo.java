package com.lidiaBaixauli.figuras;

/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class Rectangulo {
    //atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //métodos
    public double calculaArea(){
        return base * altura;
    }
    
    public double calculaPerimetro(){
        return (base*2) + (altura*2);
    }
    
    
    
}
