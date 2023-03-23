package com.areaspoo.herencia;

public class Rombo extends Area {
    float diagonalMayor, diagonalMenor, lado;

    public Rombo() {
    }

    public Rombo(float area, float perimetro, float diagonalMayor, float diagonalMenor, float lado) {
        super(area, perimetro);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return (diagonalMenor * diagonalMayor) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 4;
    }
}
