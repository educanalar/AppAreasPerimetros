package com.areaspoo.herencia;

public class Hexagono extends Area{
    float apotema, lado;

    public Hexagono() {
    }

    public Hexagono(float area, float perimetro, float apotema, float lado) {
        super(area, perimetro);
        this.apotema = apotema;
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return (calcularPerimetro() * apotema) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 6;
    }
}

