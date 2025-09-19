import java.util.Locale;

public class Retangulo extends FiguraGeometrica {
    private double largura, altura;

    public Retangulo (String cor, double largura, double altura) {
        super(cor); // Chama o construtor da superclasse (FiguraGeometrica)
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String getTipoFigura() {
        return "Retângulo";
    }

    @Override
    public String getDetalhes() {
        return String.format(Locale.US, "Largura: %.2f, Altura: %.2f", largura, altura);
    }
}