package Figuras3D;

import Base.*;

public class Esfera extends Figura {
    private double radio;

    public Esfera(double radio, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.radio = radio;
    }

    @Override
    public double area() {
        // Área superficial esfera = 4πr^2
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        // No aplica para 3D, retorna 0
        return 0;
    }

    @Override
    public double volumen() {
        // Volumen = 4/3 π r^3
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public String descripcion() {
        return String.format("Esfera (radio=%.2f, borde=%s, relleno=%s)", radio, colorBorde, colorRelleno);
    }
}