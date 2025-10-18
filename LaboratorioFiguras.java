import java.util.Locale;

public class LaboratorioFiguras {
    public static void main(String[] args) {
        // Criando figuras geométricas
        FiguraGeometrica triangulo = new TrianguloEquilatero("Vermelho", 5);
        FiguraGeometrica retangulo = new Retangulo("Azul", 10, 5);
        // FiguraGeometrica circulo = new Circulo("Verde", 3);
        
        // Array polimórfico
        // FiguraGeometrica[] figuras = {triangulo, retangulo, circulo};

        FiguraGeometrica[] figuras = {triangulo, retangulo};
        
        System.out.println("=== LABORATÓRIO DE FIGURAS GEOMÉTRICAS ===\n");
        
        // Demonstrando polimorfismo dinâmico
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getInfo());
            System.out.println("Detalhes: " + figura.getDetalhes());
            System.out.printf(Locale.US, "Área: %.2f%n", figura.calcularArea());
            System.out.printf(Locale.US, "Perímetro: %.2f%n", figura.calcularPerimetro());
            System.out.println("-----------------------------------");
        }
        
        // Demonstrando atributo de classe
        System.out.println("Total de figuras criadas: " + FiguraGeometrica.getTotalFiguras());
        
        
    }
}
