package com.areaspoo.herencia;

public class Cuadrado extends Area {
    float lado1;
    float lado2;

    public Cuadrado() {
    }

    public Cuadrado(float area, float perimetro, float lado1, float lado2) {
        super(area, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public float calcularArea() {
        return lado1 * lado1;
    }

    @Override
    public float calcularPerimetro() {
        return lado1 * 4;
    }
}
