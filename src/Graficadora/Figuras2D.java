package Graficadora;
/*
import Figuras2D.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Graficadora extends JPanel {

    private final ArrayList<Figura2D> figuras;

    public Graficadora(ArrayList<Figura2D> figuras) {
        this.figuras = figuras;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50, y = 50;

        for (Figura2D figura : figuras) {
            if (figura instanceof Circulo) {
                Circulo c = (Circulo) figura;
                int radio = (int) c.getRadio();
                g.drawOval(x, y, radio * 2, radio * 2);
                y += radio * 2 + 20;

            } else if (figura instanceof Cuadrado) {
                Cuadrado cu = (Cuadrado) figura;
                int lado = (int) cu.getLado();
                g.drawRect(x, y, lado, lado);
                y += lado + 20;

            } else if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura;
                int base = (int) t.getBase();
                int altura = (int) t.getAltura();
                int[] xPoints = { x, x + base / 2, x + base };
                int[] yPoints = { y + altura, y, y + altura };
                g.drawPolygon(xPoints, yPoints, 3);
                y += altura + 20;
            }
        }
    }

    public static void mostrarFiguras(ArrayList<Figura2D> figuras) {
        JFrame ventana = new JFrame("Graficador de Figuras 2D");
        Graficadora panel = new Graficadora(figuras);
        ventana.add(panel);
        ventana.setSize(400, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}*/
