package Main;

import Base.*;
import Figuras2D.*;
import Figuras3D.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();
        boolean continuar = true;

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     BIENVENIDO AL SISTEMA DE FIGURAS ║");
        System.out.println("╚══════════════════════════════════════╝");

        while (continuar) {
            mostrarMenuPrincipal();
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    crearFigura(scanner, figuras);
                    break;
                case "2":
                    mostrarFiguras(figuras);
                    break;
                case "3":
                    continuar = false;
                    System.out.println("\nGracias por usar el sistema de figuras. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intente nuevamente.\n");
            }
        }

        scanner.close();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n═════════════════════════════");
        System.out.println("  MENÚ PRINCIPAL");
        System.out.println("═════════════════════════════");
        System.out.println("  1. Crear nueva figura");
        System.out.println("  2. Mostrar todas las figuras");
        System.out.println("  3. Salir");
        System.out.println("═════════════════════════════");
    }

    public static void crearFigura(Scanner scanner, ArrayList<Figura> figuras) {
        System.out.println("\n📐 ¿Qué tipo de figura deseas crear?");
        System.out.println("  a) Círculo");
        System.out.println("  b) Cuadrado");
        System.out.println("  c) Triángulo");
        System.out.println("  d) Esfera");
        System.out.println("  e) Cubo");
        System.out.println("  f) Pirámide");
        System.out.print("Seleccione una opción (a-f): ");
        String tipo = scanner.nextLine().trim().toLowerCase();

        System.out.print("Color del borde: ");
        String borde = scanner.nextLine();
        System.out.print("Color del relleno: ");
        String relleno = scanner.nextLine();

        Figura figura = null;

        switch (tipo) {
            case "a":
                System.out.print("Ingrese el radio del círculo: ");
                double radio = Double.parseDouble(scanner.nextLine());
                figura = new Circulo(radio, borde, relleno);
                break;
            case "b":
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = Double.parseDouble(scanner.nextLine());
                figura = new Cuadrado(lado, borde, relleno);
                break;
            case "c":
                System.out.print("Ingrese la base del triángulo: ");
                double base = Double.parseDouble(scanner.nextLine());
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = Double.parseDouble(scanner.nextLine());
                figura = new Triangulo(base, altura, borde, relleno);
                break;
            case "d":
                System.out.print("Ingrese el radio de la esfera: ");
                double radioEsfera = Double.parseDouble(scanner.nextLine());
                figura = new Esfera(radioEsfera, borde, relleno);
                break;
            case "e":
                System.out.print("Ingrese el lado del cubo: ");
                double ladoCubo = Double.parseDouble(scanner.nextLine());
                figura = new Cubo(ladoCubo, borde, relleno);
                break;
            case "f":
                System.out.print("Ingrese la base de la pirámide: ");
                double basePiramide = Double.parseDouble(scanner.nextLine());
                System.out.print("Ingrese la altura de la pirámide: ");
                double alturaPiramide = Double.parseDouble(scanner.nextLine());
                figura = new Piramide(basePiramide, alturaPiramide, borde, relleno);
                break;
            default:
                System.out.println("❌ Tipo de figura no válido.");
                return;
        }

        figuras.add(figura);
        System.out.println("✅ Figura creada y añadida exitosamente.\n");
    }

    public static void mostrarFiguras(ArrayList<Figura> figuras) {
        if (figuras.isEmpty()) {
            System.out.println("\n⚠️ No hay figuras registradas aún.");
            return;
        }

        System.out.println("\n📋 LISTA DE FIGURAS REGISTRADAS:");
        for (int i = 0; i < figuras.size(); i++) {
            Figura fig = figuras.get(i);
            System.out.println("════════════════════════════════");
            System.out.printf("Figura #%d\n", i + 1);
            System.out.println(fig.descripcion());
            System.out.printf("Área: %.2f\n", fig.area());
            System.out.printf("Perímetro: %.2f\n", fig.perimetro());
            System.out.printf("Volumen: %.2f\n", fig.volumen());
        }
        System.out.println("════════════════════════════════");
    }
}