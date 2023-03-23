package com.areaspoo.herencia;

public class Triangulo extends Area {
    float base, altura, lado, lado1;

    public Triangulo() {
    }

    public Triangulo(float area, float perimetro, float base, float altura, float lado, float lado1) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.lado1 = lado1;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }


    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return lado + lado1 + base;
    }
}
