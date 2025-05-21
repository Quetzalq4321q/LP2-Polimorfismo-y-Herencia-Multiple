package Figuras3D;

import Base.*;

public class Cubo extends Figura {
    private double arista;

    public Cubo(double arista, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.arista = arista;
    }

    @Override
    public double area() {
        // Área superficial cubo = 6 * lado^2
        return 6 * arista * arista;
    }

    @Override
    public double perimetro() {
        // Perímetro borde cubo: suma aristas de una cara (4 * arista)
        return 4 * arista;
    }

    @Override
    public double volumen() {
        // Volumen cubo = lado^3
        return Math.pow(arista, 3);
    }

    @Override
    public String descripcion() {
        return String.format("Cubo (arista=%.2f, borde=%s, relleno=%s)", arista, colorBorde, colorRelleno);
    }
}

