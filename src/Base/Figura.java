package Base;

public abstract class Figura {
    protected String colorBorde;
    protected String colorRelleno;

    public Figura(String colorBorde, String colorRelleno) {
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }

    public abstract double area(); // Para 2D es área, para 3D es área superficial
    public abstract double perimetro(); // Para 3D puedes poner 0 o perímetro base, depende
    public abstract double volumen();

    public abstract String descripcion();
}

