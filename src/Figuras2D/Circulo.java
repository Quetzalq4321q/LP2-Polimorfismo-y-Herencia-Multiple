package Figuras2D;

import Base.Figura;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double volumen() {
        return 0; // No aplica para figuras 2D
    }

    @Override
    public String descripcion() {
        return String.format("Círculo (radio=%.2f, borde=%s, relleno=%s)",
                radio, colorBorde, colorRelleno);
    }
}


