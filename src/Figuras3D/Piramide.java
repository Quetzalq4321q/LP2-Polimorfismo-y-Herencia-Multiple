package Figuras3D;

import Base.*;

public class Piramide extends Figura {
    private double ladoBase;
    private double altura;

    public Piramide(double ladoBase, double altura, String colorBorde, String colorRelleno) {
        super(colorBorde, colorRelleno);
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public double area() {
        // Área superficie = área base + área lateral
        // Área base = lado^2
        double areaBase = ladoBase * ladoBase;
        // Apotema (altura lateral) = sqrt((lado/2)^2 + altura^2)
        double apotema = Math.sqrt((ladoBase / 2) * (ladoBase / 2) + altura * altura);
        // Área lateral = perímetro base * apotema / 2 = 4*lado*apotema/2 = 2*lado*apotema
        double areaLateral = 2 * ladoBase * apotema;

        return areaBase + areaLateral;
    }

    @Override
    public double perimetro() {
        // Perímetro base (cuadrado)
        return 4 * ladoBase;
    }

    @Override
    public double volumen() {
        // Volumen = (1/3) * área base * altura
        return (1.0/3.0) * (ladoBase * ladoBase) * altura;
    }

    @Override
    public String descripcion() {
        return String.format("Pirámide (lado base=%.2f, altura=%.2f, borde=%s, relleno=%s)", ladoBase, altura, colorBorde, colorRelleno);
    }
}