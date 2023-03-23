package com.areaspoo.herencia;

public class Paralelogramo extends Area{
    float base, lado, altura;

    public Paralelogramo() {
    }

    public Paralelogramo(float area, float perimetro, float base, float lado, float altura) {
        super(area, perimetro);
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base * altura);
    }

    @Override
    public float calcularPerimetro() {
        return (lado * 2) + (base * 2);
    }
}


