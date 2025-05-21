package Figuras2D;
import Base.*;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double volumen() {
        return 0; // No aplica para figuras 2D
    }

    @Override
    public String descripcion() {
        return String.format("Cuadrado (lado=%.2f, borde=%s, relleno=%s)", lado, colorBorde, colorRelleno);
    }
}


