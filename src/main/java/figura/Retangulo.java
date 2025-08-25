package figura;

public class Retangulo implements Figura {
    private ConfiguracaoPadrao config;

    public Retangulo(ConfiguracaoPadrao config) {
        this.config = config;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo na cor " + config.getCor() +
                           " com espessura " + config.getEspessura());
    }

    @Override
    public Figura clone() {
        return new Retangulo(config.clone());
    }
}
