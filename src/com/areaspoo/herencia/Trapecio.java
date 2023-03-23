package com.areaspoo.herencia;

public class Trapecio extends Area {
    float baseMayor, baseMenor, lado, lado2, altura;

    public Trapecio() {
    }

    public Trapecio(float area, float perimetro, float baseMayor, float baseMenor, float lado, float lado2, float altura) {
        super(area, perimetro);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado = lado;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public float getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return baseMayor + baseMenor + lado + lado2;
    }
}
