import java.util.Locale;

// Extends para indicar que TrianguloEquilatero é uma subclasse de FiguraGeometrica
public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(String cor, double lado) {
        super(cor); // Chama o construtor da superclasse (FiguraGeometrica)
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4.0) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }

    @Override
    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.US, "Lados: %.2f", lado);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}