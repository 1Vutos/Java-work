package figura;

public class FiguraFactory {
    // Prototype base (Configuração padrão estática)
    private static ConfiguracaoPadrao configPadrao = new ConfiguracaoPadrao("preto", 2);

    public static Figura criarFigura(String tipo) {
        ConfiguracaoPadrao configClonada = configPadrao.clone();

        switch (tipo.toLowerCase()) {
            case "circulo":
                return new Circulo(configClonada);
            case "retangulo":
                return new Retangulo(configClonada);
            default:
                throw new IllegalArgumentException("Figura desconhecida: " + tipo);
        }
    }

    public static void setConfigPadrao(String cor, int espessura) {
        configPadrao.setCor(cor);
        configPadrao.setEspessura(espessura);
    }
}
