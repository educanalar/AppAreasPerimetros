package com.areaspoo.herencia;

public class Circulo extends Area {
    float pi = 3.1416f;
    float radio;

    public Circulo() {
    }

    public Circulo(float area, float perimetro, float pi, float radio) {
        super(area, perimetro);
        this.pi = pi;
        this.radio = radio;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (calcularPerimetro() * radio) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return (2 * pi) * radio;
    }
}
