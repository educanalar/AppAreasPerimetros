package com.areaspoo.herencia;

public abstract class Area {
    float area;
    float perimetro;

    public Area() {
    }

    public Area(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

}
