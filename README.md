[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/BUipTTbO)
# Laboratório de Figuras Geométricas
## Objetivo
Implementar uma hierarquia de classes para representar figuras geométricas, demonstrando conceitos fundamentais de orientação a objetos como herança, polimorfismo e interfaces.

## Estrutura de Arquivos
### Arquivos Fornecidos:
- LaboratorioFiguras.java - Classe principal com método main
- CalculosGeometricos.java - Interface que define os métodos obrigatórios

### Arquivos a Serem Implementados:
- FiguraGeometrica.java - Classe abstrata base
- TrianguloEquilatero.java - Classe para triângulos equiláteros
- Retangulo.java - Classe para retângulos
- Circulo.java - Classe para círculos (desafio adicional)

## Passo a Passo
### Passo 1: Analisar a Interface
- Examine a interface CalculosGeometricos.java para entender quais métodos devem ser implementados por todas as figuras geométricas:

```
public interface CalculosGeometricos {
    double calcularArea();
    double calcularPerimetro();
    String getTipoFigura();
}
```

### Passo 2: Implementar a Classe Abstrata FiguraGeometrica
- Crie a classe FiguraGeometrica.java que deve:
- Implementar a interface CalculosGeometricos
- Possuir os atributos:
  - cor (String) - cor da figura
  - id (int) - identificador único
- totalFiguras (static int) - contador de figuras criadas
- Implementar um construtor que:
  - Recebe a cor como parâmetro
  - Incrementa o contador totalFiguras
  - Atribui um ID único à figura
- Implementar getters e setters para a cor
- Implementar o método estático getTotalFiguras()
- Implementar o método getInfo() que retorna informações básicas
- Declarar o método abstrato getDetalhes()

### Passo 3: Implementar a Classe TrianguloEquilatero
- Crie a classe TrianguloEquilatero.java que deve:
  - Estender FiguraGeometrica
  - Possuir atributo: lado (double)
  - Implementar um construtor que recebe cor e lado
  - Implementar getters e setters para o lado
  - Sobrescrever os métodos:
    - calcularArea(): Fórmula: (√3/4) * lado²
    - calcularPerimetro(): Fórmula: 3 * lado
    - getTipoFigura(): Retorna "Triângulo Equilátero"
    - getDetalhes(): Retorna informações específicas do triângulo
    - getInfo(): Retorna informações completas formatadas

### Passo 4: Implementar a Classe Retangulo
- Crie a classe Retangulo.java que deve:
  -Estender FiguraGeometrica
  - Possuir atributos: largura e altura (double)
  - Implementar um construtor que recebe cor, largura e altura
  - Implementar getters e setters para largura e altura
  - Sobrescrever os métodos:
    - calcularArea(): Fórmula: largura * altura
    - calcularPerimetro(): Fórmula: 2 * (largura + altura)
    - getTipoFigura(): Retorna "Retângulo"
    - getDetalhes(): Retorna informações específicas do retângulo

### Passo 5: Executar e Testar
Compile e execute o programa:
```
javac *.java
java LaboratorioFiguras
```
Verifique se a saída corresponde ao esperado:

```
=== LABORATÓRIO DE FIGURAS GEOMÉTRICAS ===

ID: 1, Cor: Vermelho, Tipo: Triângulo Equilatero, Lados: 5.00, Área: 10.83, Perímetro: 15.00, Cor: Vermelho
Detalhes: Lados: 5.00
Área: 10.83
Perímetro: 15.00
-----------------------------------
ID: 2, Cor: Azul, Tipo: Retângulo, Largura: 10.00, Altura: 5.00, Área: 50.00, Perímetro: 30.00, Cor: Azul
Detalhes: Largura: 10.00, Altura: 5.00
Área: 50.00
Perímetro: 30.00
-----------------------------------
Total de figuras criadas: 2
```
### Critérios de Avaliação
- Correta implementação da hierarquia de classes
- Uso adequado de herança e polimorfismo
- Implementação correta dos cálculos geométricos
- Formatação adequada das saídas
- Funcionamento correto do contador de figuras

# NÃO ESQUEÇA DE COMMITAR SEUS ARQUIVOS NO GITHUB! NÃO SUBMETIDOS EM HORÁRIO DE AULA NÃO SERÃO CONSIDERADOS
