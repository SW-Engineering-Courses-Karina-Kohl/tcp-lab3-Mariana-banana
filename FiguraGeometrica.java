// Como é abstract, não pode criar objetos diretamente dessa classe.
// Serve como base para outras classes.
// O implements significa que a classe está implementando uma interface, ou seja, 
// ela está se comprometendo a fornecer implementações para os métodos definidos na interface CalculosGeometricos.
// Se uma classe possui pelo menos um método abstrato, a classe deve ser declarada como abstrata
import java.util.Locale;

public abstract class FiguraGeometrica implements CalculosGeometricos {
    private String cor;
    private final int id;
    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
        FiguraGeometrica.totalFiguras++; 
        this.id = FiguraGeometrica.totalFiguras; 
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public String getInfo() {
        return String.format(Locale.US,
            "ID: %d, Cor: %s, Tipo: %s, %s, Área: %.2f, Perímetro: %.2f, Cor: %s",
            this.id,
            getCor(),
            getTipoFigura(),
            getDetalhes(),
            calcularArea(),
            calcularPerimetro(),
            getCor()
        );
    }

    public abstract String getDetalhes();

    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();
    
    @Override
    public abstract String getTipoFigura();

}