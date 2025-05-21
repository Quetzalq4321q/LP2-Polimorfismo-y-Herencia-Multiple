package Figuras2D;
import Base.*;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        // Triángulo isósceles aprox
        double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return base + 2 * lado;
    }

    @Override
    public double volumen() {
        return 0; // No aplica para figuras 2D
    }

    @Override
    public String descripcion() {
        return String.format("Triángulo (base=%.2f, altura=%.2f, borde=%s, relleno=%s)", base, altura, colorBorde, colorRelleno);
    }
}

