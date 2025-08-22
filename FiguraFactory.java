public class FiguraFactory {
    private static FiguraConfigPadrao configPadrao = new FiguraConfigPadrao("vermelho", 100);

    public static Figura criarFigura(String tipo) {
        FiguraConfigPadrao config = configPadrao.clone(); // Prototype
        switch(tipo.toLowerCase()) {
            case "circulo":
                return new Circulo(config.getCor(), config.getTamanho());
            case "quadrado":
                return new Quadrado(config.getCor(), config.getTamanho());
            default:
                throw new IllegalArgumentException("Tipo de figura desconhecido");
        }
    }
}
